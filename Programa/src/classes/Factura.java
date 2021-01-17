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
public class Factura {

    private String nombre, tarjeta, cvc, vencimiento, numeroMesa;
    private int totalNeto;
    static int personas, ID;
    private Cola cola;

    public Factura(String nombre, String tarjeta, String cvc, String month, String year, String numeroMesa, int personas, int ID) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.cvc = cvc;
        this.vencimiento = month + "/" + year;
        this.numeroMesa = numeroMesa;
        this.totalNeto = 0;
        this.personas = personas;
        this.ID = ID;
        cola = new Cola();
       
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nTarjeta: " + tarjeta +" \nMesa: " + numeroMesa + "\nTotal: " + totalNeto + "\nPersonas: " + personas + "\n" + cola;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getTotalNeto() {
        return totalNeto;
    }

    public void setTotalNeto(int totalNeto) {
        this.totalNeto = totalNeto;
    }

    public void agregaPedido(String Comida, int cantidad, int precio) {
        cola.encola(new Pedidos(Comida, cantidad, precio));
    }

}
