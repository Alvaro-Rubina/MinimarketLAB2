package org.example.clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comida extends Producto{

    // Atributos
    private boolean aptaCeliacos;
    private boolean vegetariana;
    private LocalDate fechaVencimiento;
    private ArrayList<String> ingredientes;
    private boolean contieneTaac;

    // Constructores
    public Comida() {
    }

    public Comida(boolean aptaCeliacos, boolean vegetariana, LocalDate fechaVencimiento,
                  ArrayList<String> ingredientes, int idProducto) {
        this.aptaCeliacos = aptaCeliacos;
        this.vegetariana = vegetariana;
        this.fechaVencimiento = fechaVencimiento;
        this.ingredientes = ingredientes;
    }

    public Comida(String nombre, String marca, double precio, int stock, boolean aptaCeliacos,
                  boolean vegetariana, LocalDate fechaVencimiento, ArrayList<String> ingredientes, int idProducto) {
        super(nombre, marca, precio, stock, idProducto);
        this.aptaCeliacos = aptaCeliacos;
        this.vegetariana = vegetariana;
        this.fechaVencimiento = fechaVencimiento;
        this.ingredientes = ingredientes;
    }

    // Get Set

    public boolean isAptaCeliacos() {
        return aptaCeliacos;
    }

    public void setAptaCeliacos(boolean aptaCeliacos) {
        this.aptaCeliacos = aptaCeliacos;
    }

    public boolean isVegetariana() {
        return vegetariana;
    }

    public void setVegetariana(boolean vegetariana) {
        this.vegetariana = vegetariana;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
