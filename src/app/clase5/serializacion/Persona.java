package app.clase5.serializacion;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.edad;
    }
}
