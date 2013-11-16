
package app.clase4.practica;

public class Cerdo extends Animal {

       
    public Cerdo(String nombre, int peso) {
        this.setNombre(nombre);
        this.setPeso(peso);
    
    
    
    }
    
    
    @Override
    public void TipoAlimento() {
        System.out.println("Alimentos: frutas, verduras y desperdicios");
        
    }

    @Override
    public void cantidadAgua() {
        System.out.println("Cantidad de agua : 2 litros");
        
    }

    @Override
    public void codigo() {
        System.out.println("Codigo: 02888");
    }

    @Override
    public void descripcion() {
        System.out.println("Descripcion: Es una animal vertebrado que pertenece a la familia de los Suidos");
    }
    
    
}

