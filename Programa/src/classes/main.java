/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import forms.frmIniciar;
import javax.swing.JOptionPane;

/**
 *
 * @author Workstation
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static ListaSimple listasimple = new ListaSimple();
    public static ListaDoble listadoble = new ListaDoble();
    public static Arbol arbol = new Arbol();

    public static int valor = 4;

    public static void main(String[] args) {
        // TODO code application logic here
        //agrega mesas por defecto
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                listasimple.inserta(new Mesa(i, "Ocupada"));
            } else {
                listasimple.inserta(new Mesa(i, "Libre"));
            }
        }

        listadoble.inserta(new Factura("Juan", "123456789", "111", "12", "2019", "3", 2, 1));
        listadoble.agregaNuevaOrden(1, "Papas", 2, 1500);
        
        listadoble.inserta(new Factura("Ana", "987654321", "122", "1", "2040", "6", 1, 2));
        listadoble.agregaNuevaOrden(2, "Hamburguesa", 1, 2000);
        
        listadoble.inserta(new Factura("Luis", "109635278", "566", "8", "2020", "9", 3, 3));
        listadoble.agregaNuevaOrden(3, "Pinchos", 2, 1500);
        listadoble.agregaNuevaOrden(3, "Costilla", 1, 6500);
        
        arbol.insertar(1500);
        arbol.insertar(2000);
        arbol.insertar(8000);
       
        
        frmIniciar iniciar = new frmIniciar();
        iniciar.setVisible(true);

    }

    public static int getValor() {
        return valor;
    }

    public static void setValor(int valor) {
        main.valor = valor;
    }

}
