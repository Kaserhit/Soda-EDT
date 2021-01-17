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
public class Pedidos {

    private String nombreComida;
    private int cantidad, precio, total;

    public Pedidos(String nombreComida, int cantidad, int precio) {
        this.nombreComida = nombreComida;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = cantidad * precio;
    }

    @Override
    public String toString() {
        return "\n  "+nombreComida + "                            " + cantidad +  "                      " + precio +  "                       " + total+"\n" ;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
