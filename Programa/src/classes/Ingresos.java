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
public class Ingresos {

    private String mesa;
    private String pedido;
    private Cola cola;
    private ListaDoble listaDoble;


    public Ingresos(String mesa, String pedido) {
        this.mesa = listaDoble.getMesa(Integer.parseInt(pedido));
        this.pedido = cola.pedidoCompleto(Integer.parseInt(pedido));
        cola = new Cola();
        listaDoble = new ListaDoble();

    }

    @Override
    public String toString() {
        return "Ingresos del día: " + "Mesa: " + mesa + "Pedido: " + pedido + "\n" + cola;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }
    
    public void agregarPedido(String comida, int cantidad, int precio){
        cola.encola(new Pedidos(comida, cantidad, precio));
    }
}
