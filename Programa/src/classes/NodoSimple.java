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
public class NodoSimple
{
    private Mesa dato;
    private NodoSimple next;

    public NodoSimple(Mesa dato) {
        this.dato = dato;
    }

    public Mesa getDato() {
        return dato;
    }

    public void setDato(Mesa dato) {
        this.dato = dato;
    }

    public NodoSimple getNext() {
        return next;
    }

    public void setNext(NodoSimple next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "\n" + dato ;
    }
    
}
