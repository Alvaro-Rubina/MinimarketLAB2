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
    private void agregarProducto(){
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
    };


    private void agregarBebida(){
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

        System.out.print("** Sabor: ");
        String sabor = scan.nextLine();

        boolean contieneAlcoohol = false;
        System.out.print("** Contiene alcoohol? Ingrese SI o NO: ");
        contieneAlcoohol = this.verificacionBooleano(contieneAlcoohol);

        System.out.print("** Cantidad de azucar: ");
        double cantidadAzucar = 0;
        cantidadAzucar = this.verificarIngresoValorNumerico(cantidadAzucar);

        System.out.print("** Cantidad de bebida por envase (Ingrese el valor en mL): ");
        double cantidadPorEnvase = 0;
        cantidadPorEnvase = this.verificarIngresoValorNumerico(cantidadPorEnvase);


        listaProductos.add(new Bebida(nombre, marca, precio, stock, sabor, contieneAlcoohol, cantidadAzucar,
                cantidadPorEnvase, idProducto));
    }

    private void agregarGolosina(){
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

        System.out.print("** Tipo de golosina: ");
        String tipoGolosina = scan.nextLine();

        System.out.print("** Sabor: ");
        String sabor = scan.nextLine();

        System.out.print("** Cantidad por unidad: ");
        int cantidadPorUnidad = 0;
        cantidadPorUnidad= (int) this.verificarIngresoValorNumerico(cantidadPorUnidad);

        System.out.println("** Fecha de vencimiento (YYYY/MM/DD): ");
        LocalDate fechaVencimiento = LocalDate.parse(scan.nextLine());

        boolean contieneTaac = false;
        System.out.print("** Contiene TAAC? Ingrese SI o NO");
        contieneTaac = verificacionBooleano(contieneTaac);

        listaProductos.add(new Golosina(nombre, marca, precio, stock, tipoGolosina, sabor, cantidadPorUnidad,
                fechaVencimiento, contieneTaac, idProducto));

    }

    private void comprarComida(int id){
        for (Producto comidaN: listaProductos){
            if (comidaN.getIdProducto() == id){
                comidaN.setStock(comidaN.getStock() - 1);
                System.out.println("Comida vendida. Stock:  " + comidaN.getStock());
            }
        }

    }

    private void agregarComida(){

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
        aptaCeliacos = this.verificacionBooleano(aptaCeliacos);

        boolean vegetariana = false;
        System.out.print("** Es apta para vegetarianos? Ingrese SI o NO: ");
        vegetariana = this.verificacionBooleano(vegetariana);

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
            eleccion = (int) this.verificarIngresoValorNumerico(eleccion);
            switch (eleccion) {
                case 1:
                    //TODO: Implementacion logica para vender un producto
                    break;
                case 2:

                    System.out.println("\nQué producto desea ingresar?");
                    System.out.println("1- Comida \n2- Bebida \n3- Golosina \n4- Otros \n5- Salir");
                    int eleccionProducto = 0;
                    eleccionProducto = (int) this.verificarIngresoValorNumerico(eleccionProducto);
                    switch (eleccionProducto){
                        case 1:
                            this.agregarComida();
                            System.out.println("Comida agregada correctamente.");
                        case 2:
                            this.agregarBebida();
                            System.out.println("Bebida agregada correctamene.");
                        case 3:
                            agregarGolosina();
                            System.out.println("Golosina agregada correctamente");
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
    private double verificarIngresoValorNumerico(double eleccion){

        while (true){
            System.out.print("\nIngrese el número: ");
            try {
                eleccion = scan.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Se ha ingresado un carácter numérico inválido. Intente nuevamente.");
                scan.next();
            }
        }
        return eleccion;
    }
    private boolean verificacionBooleano(boolean variableBooleana){
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

    private ArrayList<String> ingresoIngredientes(){
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

