package org.example.clases;

public class Bebida extends Producto{

    // Atributos
    private String sabor;
    private boolean contieneAlcohol;
    private double cantidadAzucar;
    private double cantidadPorEnvase;

    //
    public Bebida() {
    }

    public Bebida(String sabor, boolean contieneAlcohol, double cantidadAzucar, double cantidadPorEnvase) {
        this.sabor = sabor;
        this.contieneAlcohol = contieneAlcohol;
        this.cantidadAzucar = cantidadAzucar;
        this.cantidadPorEnvase = cantidadPorEnvase;
    }

    public Bebida(String nombre, String marca, double precio, int stock, String sabor, boolean contieneAlcohol, double cantidadAzucar, double cantidadPorEnvase, int idProducto) {
        super(nombre, marca, precio, stock, idProducto);
        this.sabor = sabor;
        this.contieneAlcohol = contieneAlcohol;
        this.cantidadAzucar = cantidadAzucar;
        this.cantidadPorEnvase = cantidadPorEnvase;
    }

    // Get set

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isContieneAlcohol() {
        return contieneAlcohol;
    }

    public void setContieneAlcohol(boolean contieneAlcohol) {
        this.contieneAlcohol = contieneAlcohol;
    }

    public double getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(double cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public double getCantidadPorEnvase() {
        return cantidadPorEnvase;
    }

    public void setCantidadPorEnvase(double cantidadPorEnvase) {
        this.cantidadPorEnvase = cantidadPorEnvase;
    }
}
