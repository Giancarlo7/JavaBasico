
package app.clase6.abejas;


public class Zanganos extends Eusociales {
    
    public Zanganos(String tipo, String funcion) {
    this.setTipo(tipo);
    this.setFuncion(funcion);
    }
    
     

    @Override
    public void Genero() {
        System.out.println("Genero: Machos");
    }

    @Override
    public void CicloDeDesarrollo() {
        System.out.println("Ciclo de Desarrollo: 23 dias");
    }

    @Override
    public void Alimento() {
        System.out.println("Alimento: Miel Especial");
    }
    
}

    

