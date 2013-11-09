
package app.clase2.persona;

public class Persona {
    
    public String nombres;
    public String apellidos;
    public int edad;
    
    public Persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos; //METODO 
        this.edad = edad;
    }

      
    public Persona() {}
    
    
    public void setNombresApellidos(String nombres, String apellidos){
        this.nombres = nombres;
        this.apellidos =apellidos;
                
         
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
