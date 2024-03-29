package org.example.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Minimarket {

    // Atributos
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private Proveedor proveedor = new Proveedor();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    private double balance = 0;
    private double ganancias = 0;
    private double pagos = 0;
    private int cantidadVentas = 0;

    // Get y set
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public double getPagos() {
        return pagos;
    }

    public void setPagos(double pagos) {
        this.pagos = pagos;
    }

    // Metodos ---------------------------------------------
    private void agregarProducto(){
        System.out.println("** ID del producto: ");
        int idProducto = 0;
        idProducto = (int) this.verificarIngresoValorNumerico(idProducto);

        System.out.print("\n** Nombre: ");
        scan.next();
        String nombre = scan.nextLine();

        System.out.print("** Marca: ");
        String marca = scan.nextLine();

        System.out.print("** Precio: ");
        double precio = 0;
        precio = this.verificarIngresoValorNumerico(precio);

        System.out.print("** Stock: ");
        int stock = 0;
        stock = (int) this.verificarIngresoValorNumerico(stock);

        listaProductos.add(new Producto(nombre, marca, precio, stock, idProducto));
    };


    private void agregarBebida(){
        System.out.println("** ID del producto: ");
        int idProducto = 0;
        idProducto = (int) this.verificarIngresoValorNumerico(idProducto);

        System.out.print("\n** Nombre: ");
        scan.next();
        String nombre = scan.nextLine();

        System.out.print("** Marca: ");
        String marca = scan.nextLine();

        System.out.print("** Precio: ");
        double precio = 0;
        precio = this.verificarIngresoValorNumerico(precio);

        System.out.print("** Stock: ");
        int stock = 0;
        stock = (int) this.verificarIngresoValorNumerico(stock);

        System.out.print("** Sabor: ");
        scan.next();
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
        int idProducto = 0;
        idProducto = (int) this.verificarIngresoValorNumerico(idProducto);

        System.out.print("\n** Nombre: ");
        scan.next();
        String nombre = scan.nextLine();

        System.out.print("** Marca: ");
        String marca = scan.nextLine();

        System.out.print("** Precio: ");
        double precio = 0;
        precio = this.verificarIngresoValorNumerico(precio);

        System.out.print("** Stock: ");
        int stock = 0;
        stock = (int) this.verificarIngresoValorNumerico(stock);

        System.out.print("** Tipo de golosina: ");
        String tipoGolosina = scan.nextLine();

        System.out.print("** Sabor: ");
        String sabor = scan.nextLine();

        System.out.print("** Cantidad por unidad: ");
        int cantidadPorUnidad = 0;
        cantidadPorUnidad= (int) this.verificarIngresoValorNumerico(cantidadPorUnidad);

        System.out.println("** Fecha de vencimiento (YYYY-MM-DD): ");
        LocalDate fechaVencimiento = LocalDate.parse(scan.nextLine());

        boolean contieneTaac = false;
        System.out.print("** Contiene TAAC? Ingrese SI o NO");
        contieneTaac = verificacionBooleano(contieneTaac);

        listaProductos.add(new Golosina(nombre, marca, precio, stock, tipoGolosina, sabor, cantidadPorUnidad,
                fechaVencimiento, contieneTaac, idProducto));

    }

    private void agregarComida(){

        System.out.println("** ID del producto: ");
        int idProducto = 0;
        idProducto = (int) this.verificarIngresoValorNumerico(idProducto);

        System.out.print("\n** Nombre: ");
        scan.next();
        String nombre = scan.nextLine();

        System.out.print("** Marca: ");
        String marca = scan.nextLine();

        System.out.print("** Precio: ");
        double precio = 0;
        precio = this.verificarIngresoValorNumerico(precio);

        System.out.print("** Stock: ");
        int stock = 0;
        stock = (int) this.verificarIngresoValorNumerico(stock);

        boolean aptaCeliacos = false;
        System.out.print("** Es apta para celíacos? Ingrese SI o NO: ");
        aptaCeliacos = this.verificacionBooleano(aptaCeliacos);

        boolean vegetariana = false;
        System.out.print("** Es apta para vegetarianos? Ingrese SI o NO: ");
        vegetariana = this.verificacionBooleano(vegetariana);

        System.out.println("** Fecha de vencimiento (YYYY-MM-DD): ");
        LocalDate fechaVencimiento = LocalDate.parse(scan.nextLine());

        System.out.println("** Ingredientes (Para terminar digite TERMINAR): ");
        ArrayList<String> ingredientes = this.ingresoIngredientes();


        listaProductos.add(new Comida(nombre, marca, precio, stock, aptaCeliacos, vegetariana, fechaVencimiento,
                ingredientes, idProducto));
    }

    private void venderProducto(int id){
        for (Producto productoN: listaProductos){
            if (productoN.getIdProducto() == id){
                System.out.print("Cuantas unidades de " + productoN.getNombre() + " desea vender?: ");
                int cantidadVender = 0;
                cantidadVender = (int) this.verificarIngresoValorNumerico(cantidadVender);

                productoN.setStock(productoN.getStock() - cantidadVender);
                System.out.println("Se han vendido " + cantidadVender + " unidades del producto " + productoN.getNombre());
                System.out.println("Stock restante: " + productoN.getStock());
                this.cantidadVentas += 1;
                this.ganancias += productoN.getPrecio();
                this.balance += productoN.getPrecio();
            }else {
                System.out.println("No se encuentra registrado un producto con el ID dada.");
            }
        }

    }

    private String pagarAlProveedor(){
        System.out.print("Ingrese el monto que debe pagar al proveedor: ");
        double montoPagar = 0;
        montoPagar = this.verificarIngresoValorNumerico(montoPagar);

        if (montoPagar <= this.balance){
            proveedor.setBalance(proveedor.getBalance() + montoPagar);
            this.balance -= montoPagar;
            this.pagos += montoPagar;
            return "Pago al proveedor realizado correctamente";
        }else{
            return "No hay suficientes fondos para realizar el pago al proveedor";
        }
    }

    // Menu de selección --------------------------------------------------
    public void menuDeSeleccion(){

        int eleccion = 0;

        System.out.println("\nIngrese el numero correspondiente a la accion que desea realizar:");
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
                    System.out.print("** Ingrese el ID del producto que desea vender: ");
                    int id = 0;
                    id = (int) this.verificarIngresoValorNumerico(id);
                    this.venderProducto(id);
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
                            break;
                        case 2:
                            this.agregarBebida();
                            System.out.println("Bebida agregada correctamene.");
                            break;
                        case 3:
                            agregarGolosina();
                            System.out.println("Golosina agregada correctamente");
                            break;
                        case 4:
                            agregarProducto();
                            System.out.println("Producto agregado correctamente");
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 3:
                    System.out.println(this.pagarAlProveedor());
                    break;
                case 4:
                    System.out.println("Se ha realizado un total de " + this.cantidadVentas + " ventas");
                    break;
                case 5:
                    System.out.println("* Ganancias: " + this.ganancias);
                    System.out.println("* Pagos: " + this.pagos);
                    System.out.println("* BALANCE: " + this.balance);
                    break;
                case 6:
                    //TODO: Implementacion logica para solicitar comanda a la cocina ?????????
                    break;
                case 7:
                    //TODO: Implementacion logica para pagar cuenta
                    break;
                case 8:
                    //TODO: Implementacion logica para mostrar platos mas pedidos
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opcion que ha ingresado no está contemplada, intente nuevamente.");
                    continue;
            }
            System.out.print("\nDesea realizar otra operación? Ingrese SI o NO: ");
            boolean continuar = false;
            continuar = this.verificacionBooleano(continuar);
            scan.next();

            if (continuar){
                this.menuDeSeleccion();
            } else{
                break;
            }
        }
    }
    private double verificarIngresoValorNumerico(double eleccion){

        while (true){
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

