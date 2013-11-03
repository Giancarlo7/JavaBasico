package app.clase2.animales;


public class Gallina extends Animal {
    
    public Gallina(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
        
    }

    public void hacerRuido() {
    
        System.out.println("cuacuacua");
    }

  
    public void comer() {
       System.out.println("maiz");
    }

  
    
    
}
