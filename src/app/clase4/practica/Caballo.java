
package app.clase4.practica;

public class Caballo extends Animal {

    public Caballo(String nombre, int peso) {
        this.setNombre(nombre);
        this.setPeso(peso);
        
    }
   
    @Override
    public void TipoAlimento() {
        System.out.println("Alimentos: Pasto y Alfalfa");
        
    }

    @Override
    public void cantidadAgua() {
        System.out.println("Cantidad de agua : 2 litros");
        
    }

    @Override
    public void codigo() {
        System.out.println("Codigo: 02777");
    }

    @Override
    public void descripcion() {
        System.out.println("Descripcion: Es un mamifero que pertenece a la familia de los Equidos");
    }
    
    
}
