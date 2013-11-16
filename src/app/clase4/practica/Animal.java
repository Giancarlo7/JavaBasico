package app.clase4.practica;

import java.util.Date;

public abstract class Animal {
    
    private String nombre;
    private int peso;
    private String especie;
    private Date fechaNacimiento;

    public abstract void TipoAlimento ();
    public abstract void cantidadAgua();
    public abstract void codigo();
    public abstract void descripcion();
   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
   
    
}
