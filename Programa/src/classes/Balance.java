/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Andres M
 */
public class Balance {
    
    private String ID;
    private int total;
    private Cola cola;

    public Balance(String ID, int total, Cola cola) {
        this.ID = ID;
        this.total = total;
        this.cola = cola;
        cola = new Cola();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }
    
    public void agregaPedido(String Comida, int cantidad, int precio) {
        cola.encola(new Pedidos(Comida, cantidad, precio));
    }    
}
