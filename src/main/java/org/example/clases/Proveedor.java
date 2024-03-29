package org.example.clases;

import java.util.ArrayList;

public class Proveedor extends Persona{

    // Atributos
    private ArrayList<Minimarket> listaNegociosClientes;
    private double balance;

    // Get set

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
