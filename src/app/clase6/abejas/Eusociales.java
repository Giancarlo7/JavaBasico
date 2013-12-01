
package app.clase6.abejas;


public abstract class  Eusociales {
    
    private String Tipo;
    private String Funcion;
    
    public abstract void Genero();
    public abstract void CicloDeDesarrollo();
    public abstract void Alimento();
    
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipos) {
        this.Tipo = Tipos;
    }

    public String getFuncion() {
        return Funcion;
    }

    public void setFuncion(String Funcion) {
        this.Funcion = Funcion;
    }
   
    
    
    
    
    
    
    
    
}
