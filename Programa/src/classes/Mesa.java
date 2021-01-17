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
public class Mesa {

    private int numeroMesa;
    private String state;

    public Mesa(int numeroMesa, String state) {
        this.numeroMesa = numeroMesa;
        this.state = state;
    }

    @Override
    public String toString() {
        return "\nNumero de Mesa: " + numeroMesa + " Estado: " + state;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
