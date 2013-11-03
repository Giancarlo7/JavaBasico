
package app.clase2.animales;

public class Tigre extends Animal {

    public Tigre(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
        
    }

   
    public void hacerRuido() {
        System.out.println("GRRRRRRRR");
    }
    public void hacerRuido(Boolean molestar) {
        System.out.println("GDFSDJFKSJDFJKSGFDGDF");
    }

   
    public void comer() {
        System.out.println("carne");
    }

    
    
}
