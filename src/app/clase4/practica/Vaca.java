package app.clase4.practica;

public class Vaca extends Animal {
    
    public Vaca (String nombre, int peso) {
        this.setNombre(nombre);
        this.setPeso(peso);
    
    
    
    }
    
    
    @Override
    public void TipoAlimento() {
        System.out.println("Alimentos: pastos secos y legumbres");
        
    }

    @Override
    public void cantidadAgua() {
        System.out.println("Cantidad de agua : 2 litros");
        
    }

    @Override
    public void codigo() {
        System.out.println("Codigo: 02555");
    }

    @Override
    public void descripcion() {
        System.out.println("Descripcion: Es una animal grande de cuerpo robusto");
    }
    
    
}

    
    
