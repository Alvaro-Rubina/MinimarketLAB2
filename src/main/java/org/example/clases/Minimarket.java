package org.example.clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Minimarket {

    // Atributos
    ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    // Get
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }


    // Metodos
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

    public void agregarComida(String nombre, String marca, double precio, int stock, boolean aptaCeliacos,
                                    boolean vegetariana, LocalDate fechaVencimiento, ArrayList<String> ingredientes,  int idProducto){

        listaProductos.add(new Comida(nombre, marca, precio, stock, aptaCeliacos, vegetariana, fechaVencimiento,
                ingredientes, idProducto));
    }
}

