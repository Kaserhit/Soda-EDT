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
public class Cola {

    private NodoCola frente, ultimo;

    //siempre se agrega al final
    public void encola(Pedidos p) {
        NodoCola aux = new NodoCola(p);
        if (frente == null) {
            frente = aux;
        } else {
            ultimo.setAtras(aux);
        }
        ultimo = aux;

    }

    //saca el ultimo nodo
    public NodoCola atiende() {
        NodoCola aux = frente;

        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
            if (frente == null) {
                ultimo = null;
            }
        }

        return aux;

    }

    @Override
    public String toString() {
        String msj = "";
        int cont = 0;
        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;
                msj += cont + ". " + aux.getDato().getNombreComida() + " \n";
                aux = aux.getAtras();
            }
        } else {
            msj += "Sin Pedidos";
        }

        return msj;

    }

    //devuelve el total de pedidos de un cliente
    public int PedidosCola() {
        int cont = 0;
        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;

                aux = aux.getAtras();
            }
        }

        return cont;
    }

    //devuelve el monto total del pedido a editar
    public int PedidosColaEditar(int pedido) {
        int cont = 0;
        int total = 0;
        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;
                if (cont == pedido) {
                    total = aux.getDato().getTotal();
                }

                aux = aux.getAtras();
            }
        }

        return total;
    }

    //devuelve el nombre de un item especifico
    public String getNombreCola(int pedido) {
        int cont = 0;
        String msj = "";
        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;
                if (cont == pedido) {
                    msj = aux.getDato().getNombreComida();
                }
                aux = aux.getAtras();
            }
        }

        return msj;
    }

    //devuelve el precio de un item especifico
    public int getPrecioCola(int pedido) {
        int cont = 0;
        int msj = 0;
        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;
                if (cont == pedido) {
                    msj = aux.getDato().getPrecio();
                }
                aux = aux.getAtras();
            }
        }
        return msj;
    }

    //devuelve el cantidad de un item especifico
    public int getCantidadCola(int pedido) {
        int cont = 0;
        int msj = 0;
        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;
                if (cont == pedido) {
                    msj = aux.getDato().getCantidad();
                }
                aux = aux.getAtras();
            }
        }

        return msj;
    }

    //cambia el cantidad de un item especifico
    public void setCantidadCola(int pedido, int cantidad) {
        int cont = 0;

        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;
                if (cont == pedido) {

                    aux.getDato().setCantidad(cantidad);
                    aux.getDato().setTotal(cantidad * aux.getDato().getPrecio());
                }
                aux = aux.getAtras();
            }
        }

    }

    //imprime todo de la cola del cliente
    public String print() {
        String msj = "";
        int cont = 0;
        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;
                msj += "\n" + aux.getDato();
                aux = aux.getAtras();
            }
        } else {
            msj += "Sin Pedidos";
        }

        return msj;

    }

    //devuelve toda la informacion de un pedido completo
    public String pedidoCompleto(int pedido) {
        String msj = "";
        int cont = 0;
        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;
                if (cont == pedido) {
                    msj += aux.getDato().getNombreComida() + " ₡" + aux.getDato().getTotal();
                }
                aux = aux.getAtras();
            }
        } else {
            msj += "Sin Pedidos";
        }

        return msj;

    }

    //devuelve el monto de suma para un pedido
    public int pedidoValida(String name, int cant) {
        NodoCola aux = frente;
        int valida = 0;

        if (aux != null) {
            while (aux != null) {
                if (aux.getDato().getNombreComida().equals(name)) {
                    valida = aux.getDato().getTotal();
                    aux.getDato().setCantidad(aux.getDato().getCantidad() + cant);
                    aux.getDato().setTotal(aux.getDato().getCantidad() * aux.getDato().getPrecio());
                    valida = aux.getDato().getTotal() - valida;
                }
                aux = aux.getAtras();
            }
        }

        return valida;

    }

    //borra un pedido completo por nombre
    public void borrar(String name) {
        NodoCola aux = frente.getAtras(), aux2 = frente;
        boolean valida = false;

        while (aux != null && valida == false) {

            if (aux2.getDato().getNombreComida().equals(name)) {
                if (aux2.getAtras().equals(frente.getAtras())) {
                    aux2.setAtras(null);
                    frente = aux;
                    valida = true;
                }
            } else if (aux.getDato().getNombreComida().equals(name)) {
                if (aux.getAtras() == null) {
                    aux2.setAtras(null);
                    ultimo = aux;

                } else {
                    aux2.setAtras(aux2.getAtras().getAtras());
                    aux.setAtras(null);

                }
                valida = true;
            } else {
                aux = aux.getAtras();
                aux2 = aux2.getAtras();
            }

        }

    }

//devuelve el monto total del pedido a editar
    public int PedidosColaEliminar(int pedido) {
        int cont = 0;
        int total = 0;
        NodoCola aux = frente;
        if (aux != null) {
            while (aux != null) {
                cont++;
                if (cont == pedido) {
                    total = aux.getDato().getTotal();
                    borrar(aux.getDato().getNombreComida());
                }

                aux = aux.getAtras();
            }
        }

        return total;
    }

}
