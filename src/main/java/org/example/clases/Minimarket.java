package org.example.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Minimarket {

    // Atributos
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    // Get
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }


    // Metodos ------------------------
    public String agregarProducto(Producto productoN){
        listaProductos.add(productoN);
        return "Producto agregado correctamente";
    };


    public String agregarBebida(Bebida bebidaN){
        listaProductos.add(bebidaN);
        return "Bebida agregada correctamente";
    }

    public String agregarGolosina(Golosina golosinaN){
        listaProductos.add(golosinaN);
        return "Golosina agregada correctamente";
    }

    public void comprarComida(int id){
        for (Producto comidaN: listaProductos){
            if (comidaN.getIdProducto() == id){
                comidaN.setStock(comidaN.getStock() - 1);
                System.out.println("Comida vendida. Stock:  " + comidaN.getStock());
            }
        }

    }

    public void agregarComida(){

        System.out.println("** ID del producto: ");
        int idProducto = scan.nextInt();

        System.out.print("\n** Nombre: ");
        String nombre = scan.nextLine();

        System.out.print("** Marca: ");
        String marca = scan.nextLine();

        System.out.print("** Precio: ");
        double precio = scan.nextDouble();

        System.out.print("** Stock: ");
        int stock = scan.nextInt();

        boolean aptaCeliacos = false;
        System.out.print("** Es apta para celíacos? Ingrese SI o NO: ");
        aptaCeliacos = this.comidaAptaCeliacosOrVegetariana(aptaCeliacos);

        boolean vegetariana = false;
        System.out.print("** Es apta para vegetarianos? Ingrese SI o NO: ");
        vegetariana = this.comidaAptaCeliacosOrVegetariana(vegetariana);

        System.out.println("** Fecha de vencimiento (YYYY/MM/DD): ");
        LocalDate fechaVencimiento = LocalDate.parse(scan.nextLine());

        System.out.println("** Ingredientes (Para terminar digite TERMINAR): ");
        ArrayList<String> ingredientes = this.ingresoIngredientes();


        listaProductos.add(new Comida(nombre, marca, precio, stock, aptaCeliacos, vegetariana, fechaVencimiento,
                ingredientes, idProducto));
    }

    // Menu de selección
    public void menuDeSeleccion(){

        int eleccion = 0;

        System.out.println("\nSeleccione la opción que desee realizar:");
        System.out.println("1- Vender un producto");
        System.out.println("2- Ingresar un producto");
        System.out.println("3- Pagar al proveedor");
        System.out.println("4- Consulta de ventas");
        System.out.println("5- Consultar balance de gastos/ganancias");
        System.out.println("6- Solicitar una comanda a la cocina (?)");
        System.out.println("7- Pagar cuenta");
        System.out.println("8- Mostrar platos más pedidos");
        System.out.println("0- Salir");

        // lógica
        while (true) {
            eleccion = this.ingresoEleccion(eleccion);
            switch (eleccion) {
                case 1:
                    //TODO: Implementacion logica para vender un producto
                    break;
                case 2:

                    System.out.println("\nQué producto desea ingresar?");
                    System.out.println("1- Comida \n2- Bebida \n3- Golosina \n4- Otros \n5- Salir");
                    int eleccionProducto = 0;
                    eleccionProducto = this.ingresoEleccion(eleccionProducto);
                    switch (eleccionProducto){
                        case 1:
                            this.agregarComida();
                        case 2:
                            this.agregarBebida():
                        case 3:
                            agregarGolosina();
                        case 4:
                            agregarProducto();
                        case 5:
                            break;
                    }

                    break;
                case 3:
                    //TODO: Implementacion logica para pagar al proveedor
                    break;
                case 4:
                    //TODO: Implementacion logica para consultar ventas
                    break;
                case 5:
                    //TODO: Implementacion logica para consultar balance
                    break;
                case 6:
                    //TODO: Implementacion logica para solicitar comanda a la cocina
                    break;
                case 7:
                    //TODO: Implementacion logica para pagar cuenta
                    break;
                case 8:
                    //TODO: Implementacion logica para mostrar platos mas pedidos
                    break;
                case 0:
                    //TODO: Implementacion logica para salir
                    break;
                default:
                    System.out.println("La opcion que ha ingresado no está contemplada, intente nuevamente.");
                    continue;
            }
            break;
        }
    }
    public int ingresoEleccion(int eleccion){

        while (true){
            System.out.print("\nIngrese su elección: ");
            try {
                eleccion = scan.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Se ha ingresado un carácter inválido. Intente nuevamente.");
                scan.next();
            }
        }
        return eleccion;
    }
    public boolean comidaAptaCeliacosOrVegetariana(boolean variableBooleana){
        while (true) {
            String eleccion = scan.nextLine().toUpperCase();
            if ((eleccion.equalsIgnoreCase("SI")) || (eleccion.equalsIgnoreCase("NO"))){
                switch (eleccion){
                    case "SI":
                        variableBooleana = true;
                        break;
                    case "NO":
                        variableBooleana = false;
                        break;
                }
                break;
            }else {
                System.out.println("Ingrese una opcion válida, intente nuevamente.");
            }
        }
        return variableBooleana;
    }

    public ArrayList<String> ingresoIngredientes(){
        ArrayList<String> ingredientes = new ArrayList<String>();
        while (true){
            String ingrediente = scan.nextLine();
            if (!(ingrediente.equalsIgnoreCase("TERMINAR"))){
                ingredientes.add(ingrediente);
            }else {
                break;
            }
        }
        return ingredientes;
    }
}

