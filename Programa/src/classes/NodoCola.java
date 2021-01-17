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
public class NodoCola {

    private NodoCola atras;
    private Pedidos dato;

    public NodoCola(Pedidos dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "" + dato;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }

    public Pedidos getDato() {
        return dato;
    }

    public void setDato(Pedidos dato) {
        this.dato = dato;
    }
}
