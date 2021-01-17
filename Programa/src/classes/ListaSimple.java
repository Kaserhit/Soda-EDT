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
public class ListaSimple {

    public static NodoSimple cabeza;

    //agrega datos a la lista
    //valida la posicion
    public static void inserta(Mesa e) {
        if (cabeza == null) {
            cabeza = new NodoSimple(e);
        } else if (e.getNumeroMesa() < cabeza.getDato().getNumeroMesa()) {
            NodoSimple aux = new NodoSimple(e);
            aux.setNext(cabeza);
            cabeza = aux;

        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new NodoSimple(e));
        } else {
            NodoSimple aux = cabeza;
            while (aux.getNext() != null && e.getNumeroMesa() > aux.getNext().getDato().getNumeroMesa()) {
                aux = aux.getNext();
            }
            NodoSimple temp = new NodoSimple(e);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

//imprime la lista de mesas
    public static void print() {
        NodoSimple aux = cabeza;
        String msj = "";
        while (aux != null) {
            msj += aux.getDato().toString();
            aux = aux.getNext();
        }
        JOptionPane.showMessageDialog(null, msj);
    }

//busca el estado de la mesa
//devuelve el estado como parametro
    public static String buscaState(int Mesa) {
        NodoSimple aux = cabeza;
        String state = "";
        if (aux != null) {
            while (aux != null) {
                if (aux.getDato().getNumeroMesa() == Mesa) {
                    state = aux.getDato().getState();
                }

                aux = aux.getNext();
            }
        } else {
            state = "No hay mesas";
        }
        return state;
    }

//busca el estado de la mesa
//actualiza el estado de la misma
    public static void cambiaEstado(int Mesa) {
        NodoSimple aux = cabeza;

        if (aux != null) {
            while (aux != null) {
                if (aux.getDato().getNumeroMesa() == Mesa) {
                    aux.getDato().setState("Ocupada");
                }

                aux = aux.getNext();
            }
        }
    }

    //busca el estado de la mesa
//actualiza el estado de la misma
    public static void cambiaEstadoLibre(int Mesa) {
        NodoSimple aux = cabeza;

        if (aux != null) {
            while (aux != null) {
                if (aux.getDato().getNumeroMesa() == Mesa) {
                    aux.getDato().setState("Libre");
                }
                aux = aux.getNext();
            }
        }
    }

    //cuenta la cantidad de mesas que se encuentran en ese momento 
    public static int cuentaMesas() {
        NodoSimple aux = cabeza;
        int cont = 1;
        if (aux != null) {
            while (aux != null) {
                cont++;
                aux = aux.getNext();
            }
        }

        return cont;
    }

    //elimina la mesa por un parametro
    public static void elimina(int mesa) {
        NodoSimple aux = cabeza, aux2 = cabeza.getNext();

        if (aux.getDato().getNumeroMesa() == mesa) {

            cabeza = cabeza.getNext();

        } else {
            while (aux2 != null) {

                if (aux2.getDato().getNumeroMesa() == mesa) {

                    aux.setNext(aux.getNext().getNext());
                    aux2.setNext(null);
                }

                aux = aux.getNext();
                aux2 = aux2.getNext();
            }

        }

    }

    //cuenta la cantidad de mesas que se encuentran en ese momento 
    public static int buscaMesas(int numero) {
        NodoSimple aux = cabeza;
        int falta = 0;

        if (aux != null) {
            while (aux != null) {
                if (aux.getDato().getNumeroMesa() == numero) {
                    falta = 1;
                }

                aux = aux.getNext();
            }
        }
        //System.out.println(falta);
        return falta;
    }

    //muestra la mesas disponibles para eliminar 
    public static String printMesasLibresaEliminar() {
        NodoSimple aux = cabeza;
        String msj = "";
        String titulo = "";

        if (aux != null) {
            while (aux != null) {
                if (aux.getDato().getState().equals("Libre")) {
                    titulo = "Mesas disponibles a eliminar" + "\n";
                    msj +=  "Mesa #" + aux.getDato().getNumeroMesa() + "\n";
                }

                aux = aux.getNext();
            }
        }
        return titulo + msj;
    }

    //muestra la mesas disponibles para eliminar valida que si se pueda eliminar
    public static int validaMesasLibresaEliminar(int mesa) {
        NodoSimple aux = cabeza;
        int valor = 0;

        if (aux != null) {
            while (aux != null) {
                if (aux.getDato().getNumeroMesa() == mesa && aux.getDato().getState().equals("Libre")) {
                    valor = 1;
                }

                aux = aux.getNext();
            }
        }
        return valor;
    }
}
