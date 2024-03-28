package org.example;

import org.example.clases.Comida;
import org.example.clases.Minimarket;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instancia del minimarket
        Minimarket minimarket = new Minimarket();

        // Menu
        seleccionMenu(minimarket);

    }
    public static void seleccionMenu(Minimarket minimarket){
        int eleccion = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\nMenú del Minimarket:");
            System.out.println("1- Vender/Cobrar un producto");
            System.out.println("2- Ingreso de mercadería");
            System.out.println("3- Pago a proveedor");
            System.out.println("4- Consulta de ventas");
            System.out.println("5- Balance (mostrar ganancias y pérdidas)");
            System.out.println("6- Solicitar una comanda a la cocina");
            System.out.println("7- Pagar cuenta");
            System.out.println("8- Información estadística de platos más pedidos");
            System.out.println("0- Salir");
            System.out.print("Ingrese su opción: ");

            eleccion = scan.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Opción 1 seleccionada: Vender/Cobrar un producto");
                    System.out.println("Ingrese el codigo del producto");
                    int id = scan.nextInt();
                    minimarket.comprarComida(id);
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada: Ingreso de mercadería");
                    // Lógica para ingresar mercadería
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada: Pago a proveedor");
                    // Lógica para realizar pago a proveedor
                    break;
                case 4:
                    System.out.println("Opción 4 seleccionada: Consulta de ventas");
                    System.out.println("Seleccione:");
                    System.out.println("a- Consulta diaria");
                    System.out.println("b- Consulta mensual");
                    String subopcion = scan.next();
                    switch(subopcion){
                        case "a":
                            System.out.println("Consulta diaria seleccionada");
                            // Lógica para consulta diaria de ventas
                            break;
                        case "b":
                            System.out.println("Consulta mensual seleccionada");
                            // Lógica para consulta mensual de ventas
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }
                    break;
                case 5:
                    System.out.println("Opción 5 seleccionada: Balance (mostrar ganancias y pérdidas)");
                    // Lógica para mostrar el balance
                    break;
                case 6:
                    System.out.println("Opción 6 seleccionada: Solicitar una comanda a la cocina");
                    // Lógica para solicitar comanda a la cocina
                    break;
                case 7:
                    System.out.println("Opción 7 seleccionada: Pagar cuenta");
                    // Lógica para pagar cuenta
                    break;
                case 8:
                    System.out.println("Opción 8 seleccionada: Información estadística de platos más pedidos");
                    // Lógica para mostrar estadísticas de platos más pedidos
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (eleccion != 0);

    }
}