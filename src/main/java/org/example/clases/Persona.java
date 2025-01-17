package org.example.clases;

public class Persona {

    // Atributos
    private String nombre;
    private long dni;

    // Constructores
    public Persona() {
    }

    public Persona(String nombre, long dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Get set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
}
