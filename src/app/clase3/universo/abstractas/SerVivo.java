package app.clase3.universo.abstractas;

public abstract class SerVivo {

    private String nombre;
    
    public abstract void comer();

    public abstract void comunicarse();

    public abstract void sentir();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
