
package app.clase3.objeto;


public class Socio {
private int codigo;
private String nombre;
private String direccion;
// Generar SET y GET

public Socio(int c, String n, String d) {
this.codigo = c;
this.nombre = n;
this.direccion = d;
} 



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


public String toString(){
        String cadena = "Codigo : " + this.codigo;
        cadena += "nombre: " + this.nombre;
        cadena += "direccion: " + this.direccion;
        return cadena;
}
public boolean equals(Object o){
    Socio s = (Socio)o;
    if(this.codigo == s.codigo && 
        this.nombre.equals(s.nombre) &&
        this.direccion.equals(s.direccion) ){
return true;
} else {
return false;
} 
}
}

