/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Steven
 */
public class NodoDoble {

    private Factura dato;
    private NodoDoble next, back;

    public NodoDoble(Factura dato) {
        this.dato = dato;
    }

    public Factura getDato() {
        return dato;
    }

    public void setDato(Factura dato) {
        this.dato = dato;
    }

    public NodoDoble getNext() {
        return next;
    }

    public void setNext(NodoDoble next) {
        this.next = next;
    }

    public NodoDoble getBack() {
        return back;
    }

    public void setBack(NodoDoble back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "" + dato;
    }

}
