package org.example;

import org.example.clases.Minimarket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instancia del minimarket
        Minimarket minimarket = new Minimarket();

        // Menu
        System.out.println("-- MINIMARKET --");
        minimarket.menuDeSeleccion();

    }

}