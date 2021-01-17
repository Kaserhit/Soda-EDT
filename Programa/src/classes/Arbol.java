/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class Arbol {

    public static NodoArbol raiz;
    public static int cont;
    public static int suma;
    public static String msj="";
    

    //llama al metodo recursivo que agrega los nodos con los datos de factura al arbol
    public static void insertar(int datos) {
        if (raiz == null) {
            raiz = new NodoArbol(datos);
        } else {
            insertaRec(datos, raiz);
        }
    }

    //agrega y almacena los datos por numero de mesa al arbol
    private static void insertaRec(int datos, NodoArbol n) {
        if (datos < n.getMonto()) {//izq
            if (n.getHijoIzq() == null) {
                n.setHijoIzq(new NodoArbol(datos));
            } else {
                insertaRec(datos, n.getHijoIzq());
            }
        } else {//der
            if (n.getHijoDer() == null) {
                n.setHijoDer(new NodoArbol(datos));
            } else {
                insertaRec(datos, n.getHijoDer());
            }
        }
    }

    //metodo iterativo para ordenar de forma ascendente
    public static String inOrden() {
        msj="";
        if (raiz != null) {
            inOrdenRec(raiz);
        }
        return msj;
    }

    //metodo recursivo que ordena de forma ascendente
    private static void inOrdenRec(NodoArbol n) {
        if (n != null) {
            inOrdenRec(n.getHijoIzq());
            msj+="₡"+n.getMonto()+"\n";
            inOrdenRec(n.getHijoDer());
        }
    }

    //metodo iterativo que llama a su metodo recursivo
    public  static String cuentaNodos() {
        msj="";
        cont = 0;//variable que almacenara cant de nodos en arbol
        if (raiz != null) {
            cuentaNodosRec(raiz);
            msj=("La cantidad de facturas del día fueron: " + cont);
        }
        
        return msj;
    }

    //metodo recursivo que cuenta los nodos en arbol
    private static void cuentaNodosRec(NodoArbol n) {
        if (n != null) {
            cont++;//cont asciende cada vez q encuentra datos diferente de nulo
            cuentaNodosRec(n.getHijoIzq());
            cuentaNodosRec(n.getHijoDer());
        }
    }
    
    //metodo iterativo que llama a su metodo recursivo
    public static String sumaNodos() {
        msj="";
        if (raiz != null) {
            msj=("El monto facturado del dia es de ₡"+sumaNodosRec(raiz));
        }
        
        return msj;
    }
     //metodo recursivo que cuenta los nodos en arbol
    private static int sumaNodosRec(NodoArbol n) {
        suma = n.getMonto();
        if (n.getHijoIzq() == null && n.getHijoDer() == null) {
            return suma;
        } else {
            if(n.getHijoDer() == null){
                suma += sumaNodosRec(n.getHijoIzq());
            } else if(n.getHijoIzq() == null){
                suma += sumaNodosRec(n.getHijoDer());
            } else {
                suma+= sumaNodosRec(n.getHijoIzq());
                suma+= sumaNodosRec(n.getHijoDer());
            }
        }
        return suma;
    }
}
