/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class ListaDoble {

    public static NodoDoble cabeza, ultimo;

    //inserta en la lista de manera ordenada por los capitulos
    public static void inserta(Factura s) {
        if (cabeza == null) {
            cabeza = new NodoDoble(s);
            ultimo = cabeza;

        } else if (s.getPersonas() <= cabeza.getDato().getPersonas()) {
            cabeza.setBack(new NodoDoble(s));
            cabeza.getBack().setNext(cabeza);
            cabeza = cabeza.getBack();
        } else if (s.getPersonas() >= ultimo.getDato().getPersonas()) {
            ultimo.setNext(new NodoDoble(s));
            ultimo.getNext().setBack(ultimo);
            ultimo = ultimo.getNext();
        } else {
            NodoDoble aux = cabeza;
            while (s.getPersonas() > aux.getNext().getDato().getPersonas()) {
                aux = aux.getNext();
            }

            NodoDoble temp = new NodoDoble(s);
            temp.setBack(aux);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
            aux.getNext().setBack(temp);

        }

        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo);

    }

    //imprime la lista completa
    public static void print() {
        NodoDoble aux = cabeza;
        String msj = "";

        do {
            msj += "\n" + aux.getDato();
            aux = aux.getNext();

        } while (aux != cabeza);

        JOptionPane.showMessageDialog(null, msj);
    }

    //imprime la lista filtrada por un ID
    public static void printID(int ID) {
        NodoDoble aux = cabeza;
        String msj = " ";

        do {
            if (aux.getDato().getID() == ID) {
                msj += "\n" + aux.getDato();
            }

            aux = aux.getNext();

        } while (aux != cabeza);

        JOptionPane.showMessageDialog(null, msj);
    }

    //imprime la lista filtrada por un ID para mostrar los pedidos
    public static void printIDPedidos(int ID) {
        NodoDoble aux = cabeza;
        String msj = " ";

        do {
            if (aux.getDato().getID() == ID) {
                msj += "\n" + aux.getDato().getCola();
            }

            aux = aux.getNext();

        } while (aux != cabeza);

        JOptionPane.showMessageDialog(null, msj);
    }

    //imprime la lista filtrada por un ID de la mesa
    public static String printMesa(String mesa) {
        NodoDoble aux = cabeza;

        String msj = " ";
        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) {
                    msj += "\n" + aux.getDato().getCola();
                }

                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "Mesa desocupada");
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        }
        return msj;
    }

    //resta una monto de un pedido de la orden total
    public static void restaOrden(String mesa, int pedido) {
        NodoDoble aux = cabeza;
        int total = 0;

        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) {
                    total = aux.getDato().getTotalNeto() - aux.getDato().getCola().PedidosColaEditar(pedido);
                    aux.getDato().setTotalNeto(total);
                }

                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "Mesa desocupada");
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        }

    }

    //imprime la lista filtrada por un ID de la mesa devuelve el 
    //total de pedidos
    public static int totalCola(String mesa) {
        NodoDoble aux = cabeza;

        int msj = 0;
        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) {
                    msj = aux.getDato().getCola().PedidosCola();
                }

                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "Mesa desocupada");
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        }
        return msj;
    }

    public static void agregaNuevaOrden(int ID, String Comida, int cantidad, int precio) {

        NodoDoble aux = cabeza;

        do {

            if (aux.getDato().getID() == ID) {
                aux.getDato().agregaPedido(Comida, cantidad, precio);
                aux.getDato().setTotalNeto(aux.getDato().getTotalNeto() + (precio * cantidad));
            }

            aux = aux.getNext();

        } while (aux != cabeza);
    }

    //busca el ID de la factura 
    public boolean existe(String nombre) {
        boolean valida = false;
        NodoDoble aux = cabeza;

        do {

            if (aux.getDato().getNombre().equals(nombre)) {
                valida = true;
            }

            aux = aux.getNext();

        } while (aux != cabeza);

        return valida;
    }

    //busca una serie por nombre y cantidad de capitulos para eliminarla
    public static void elimina(int ID) {
        NodoDoble aux = cabeza;
        boolean valida = false;

        if (cabeza.getDato().getID() == ID) {
            cabeza = cabeza.getNext();
            cabeza.setBack(ultimo);
            ultimo.setNext(cabeza);
            valida = true;

        } else if (cabeza.getDato().getID() == ID) {
            ultimo = ultimo.getBack();
            cabeza.setBack(ultimo);
            ultimo.setNext(cabeza);
            valida = true;
        } else {
            do {

                if (cabeza.getDato().getID() == ID) {
                    aux.getBack().setNext(aux.getNext());
                    aux.getNext().setBack(aux.getBack());
                    valida = true;

                }

                aux = aux.getNext();

            } while (aux != cabeza && valida == false);

            JOptionPane.showMessageDialog(null, "Factura eliminada correctamente");

            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        }
    }

    public static void eliminaOrden(int pedido,String mesa) {
        NodoDoble aux = cabeza;
        
        do {

            if (aux.getDato().getNumeroMesa().equals(mesa)) 
            {               
                int total=aux.getDato().getCola().PedidosColaEliminar(pedido);
                aux.getDato().setTotalNeto(aux.getDato().getTotalNeto()-total);
            }

            aux = aux.getNext();

        } while (aux != cabeza);

        if (aux == null) {
            JOptionPane.showMessageDialog(null, "Orden eliminada exitosamente");
        }
    }

    //suma la informacion de la factura y la alamcena
    public static String facturaTotal(int ID) {
        NodoDoble aux = ultimo;
        int total = 0;

        do {
            if (aux.getDato().getID() == ID) {
                total = aux.getDato().getTotalNeto();

            }
            aux = aux.getBack();

        } while (aux != ultimo);

        return Integer.toString(total);
    }

    //devuelve el numero de tarjeta del cliente
    public static String getTarjeta(int ID) {
        NodoDoble aux = ultimo;
        String total = "";

        do {
            if (aux.getDato().getID() == ID) {
                total = aux.getDato().getTarjeta();

            }
            aux = aux.getBack();

        } while (aux != ultimo);

        return total;

    }

    //devuelve el numero de tarjeta del cliente la fecha de vencimiento
    public static String getFecha(int ID) {
        NodoDoble aux = ultimo;
        String total = "";

        do {
            if (aux.getDato().getID() == ID) {
                total = aux.getDato().getVencimiento();

            }
            aux = aux.getBack();

        } while (aux != ultimo);

        return total;

    }

    //devuelve el numero de tarjeta del cliente el codigo de seguridad de la tarjeta
    public static String getCvs(int ID) {
        NodoDoble aux = ultimo;
        String total = "";

        do {
            if (aux.getDato().getID() == ID) {
                total = aux.getDato().getCvc();

            }
            aux = aux.getBack();

        } while (aux != ultimo);

        return total;

    }

    //devuelve el numero de mesa del cliente
    public static String getMesa(int ID) {
        NodoDoble aux = ultimo;
        String total = "";

        do {
            if (aux.getDato().getID() == ID) {
                total = aux.getDato().getNumeroMesa();

            }
            aux = aux.getBack();

        } while (aux != ultimo);

        return total;

    }

    //actualiza el numero de tarjeta del cliente
    public static void setTarjeta(int ID, String tarjeta) {
        NodoDoble aux = ultimo;

        do {
            if (aux.getDato().getID() == ID) {
                aux.getDato().setTarjeta(tarjeta);

            }
            aux = aux.getBack();

        } while (aux != ultimo);

    }

    //actualiza el numero de tarjeta del cliente la fecha de vencimiento
    public static void setFecha(int ID, String fecha) {
        NodoDoble aux = ultimo;

        do {
            if (aux.getDato().getID() == ID) {
                aux.getDato().setVencimiento(fecha);

            }
            aux = aux.getBack();

        } while (aux != ultimo);

    }

    //actualiza el numero de tarjeta del cliente el codigo de seguridad de la tarjeta
    public static void setCvs(int ID, String cvc) {
        NodoDoble aux = ultimo;

        do {
            if (aux.getDato().getID() == ID) {
                aux.getDato().setCvc(cvc);

            }
            aux = aux.getBack();

        } while (aux != ultimo);

    }

    //imprime el nombre de un item especifioo
    public static String getNombrePedido(String mesa, int pedido) {
        NodoDoble aux = cabeza;

        String msj = " ";
        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) {
                    msj = aux.getDato().getCola().getNombreCola(pedido);
                }

                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "Mesa desocupada");
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        }
        return msj;
    }

    //imprime el precio de un item especifioo
    public static int getPrecioPedido(String mesa, int pedido) {
        NodoDoble aux = cabeza;

        int msj = 0;
        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) {
                    msj = aux.getDato().getCola().getPrecioCola(pedido);
                }

                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "Mesa desocupada");
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        }
        return msj;
    }

    //imprime el cantidad de un item especifioo
    public static int getCantidadPedido(String mesa, int pedido) {
        NodoDoble aux = cabeza;

        int msj = 0;
        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) {
                    msj = aux.getDato().getCola().getCantidadCola(pedido);
                }

                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "Mesa desocupada");
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        }
        return msj;
    }

    //edita un pedido
    public static void setCantidadPedido(String mesa, int pedido, int cantidad, int precio) {
        NodoDoble aux = cabeza;

        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) {
                    int cant=aux.getDato().getCola().getCantidadCola(pedido);
                    aux.getDato().getCola().setCantidadCola(pedido, cantidad);
                    aux.getDato().setTotalNeto((aux.getDato().getTotalNeto())+ (precio * cantidad));
                }

                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "Mesa desocupada");
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        }

    }

    //imprime la lista filtrada por un ID de la mesa
    public static String printMesaCompleta(String mesa) {
        NodoDoble aux = cabeza;

        String msj = " ";
        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) 
                {
                    msj += "\n" + aux.getDato();
                }

                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "Mesa desocupada");
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        }
        return msj;
    }

    //imprime la lista filtrada por un ID de la mesa
    public static String printPedidoEspecifico(String mesa, int pedido) {
        NodoDoble aux = cabeza;

        String msj = " ";
        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) {
                    msj += aux.getDato().getCola().pedidoCompleto(pedido);
                }

                if (aux == null) {
                    JOptionPane.showMessageDialog(null, "Mesa desocupada");
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        }
        return msj;
    }

    //muestra la info de una mesa especifica
    public static String visualizar(String mesa) {
        NodoDoble aux = cabeza;

        String msj = " ";
        try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) {
                    msj += "Nombre: " + aux.getDato().getNombre() + "\n";
                    msj += "Numero mesa: " + aux.getDato().getNumeroMesa() + "\n";
                    msj += "Total neto: " + aux.getDato().getTotalNeto();
                }

                aux = aux.getNext();
            } while (aux != cabeza);

        } catch (Exception e) {
        }
        return msj;
    }
    
     //busca si ya existe un plato en la orden del cliente
    public static boolean buscaPedido(String mesa,String name, int cant)
    {
        
        NodoDoble aux = cabeza;
        boolean valida=true;
        
         try {
            do {
                if (aux.getDato().getNumeroMesa().equals(mesa)) 
                {
                    int total=aux.getDato().getCola().pedidoValida(name, cant);
                    
                    if(total>0)
                        aux.getDato().setTotalNeto(aux.getDato().getTotalNeto()+total);
                    else
                        valida=false;
                }

                aux = aux.getNext();

            } while (aux != cabeza);

        } catch (Exception e) {
        
        }
          
        return valida;
    }

}
