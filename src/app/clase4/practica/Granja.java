
package app.clase4.practica;


public class Granja {
    
    public static void main(String[] args) {
        
        Caballo milo = new Caballo ("milo", 400);
        
        milo.TipoAlimento();
        milo.cantidadAgua();
        milo.codigo();
        milo.descripcion();
        
        Cerdo max = new Cerdo ("max", 120);
        
        max.TipoAlimento();
        max.cantidadAgua();
        max.codigo();
        max.descripcion();
        
        Vaca mica = new Vaca ("mica", 500);
        mica.TipoAlimento();
        mica.cantidadAgua();
        mica.codigo();
        mica.descripcion();
        
        
    }
    
}
