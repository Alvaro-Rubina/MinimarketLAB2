package org.example.clases;

import java.time.LocalDate;

public class Golosina extends Producto{

    // Atributos
    private String tipoGolosina;
    private String sabor;
    private int cantidadPorUnidad;
    private LocalDate fechaVencimiento;
    private boolean contieneTaac;

    // Constructores
    public Golosina() {
    }

    public Golosina(String tipoGolosina, String sabor, int cantidadPorUnidad, LocalDate fechaVencimiento, boolean contieneTaac) {
        this.tipoGolosina = tipoGolosina;
        this.sabor = sabor;
        this.cantidadPorUnidad = cantidadPorUnidad;
        this.fechaVencimiento = fechaVencimiento;
        this.contieneTaac = contieneTaac;
    }

    public Golosina(String nombre, String marca, double precio, int stock, String tipoGolosina, String sabor,
                    int cantidadPorUnidad, LocalDate fechaVencimiento, boolean contieneTaac, int idProducto) {
        super(nombre, marca, precio, stock, idProducto);
        this.tipoGolosina = tipoGolosina;
        this.sabor = sabor;
        this.cantidadPorUnidad = cantidadPorUnidad;
        this.fechaVencimiento = fechaVencimiento;
        this.contieneTaac = contieneTaac;
    }

    // Get set
    public String getTipoGolosina() {
        return tipoGolosina;
    }

    public void setTipoGolosina(String tipoGolosina) {
        this.tipoGolosina = tipoGolosina;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getCantidadPorUnidad() {
        return cantidadPorUnidad;
    }

    public void setCantidadPorUnidad(int cantidadPorUnidad) {
        this.cantidadPorUnidad = cantidadPorUnidad;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isContieneTaac() {
        return contieneTaac;
    }

    public void setContieneTaac(boolean contieneTaac) {
        this.contieneTaac = contieneTaac;
    }
}
