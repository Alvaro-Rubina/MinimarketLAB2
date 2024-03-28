package org.example;

import org.example.clases.Minimarket;

public class Main {
    public static void main(String[] args) {

        // Instancia del minimarket
        Minimarket minimarket = new Minimarket();

        // Menu de seleccion
        System.out.println("-- MINIMARKET --");
        minimarket.menuDeSeleccion();

    }

}