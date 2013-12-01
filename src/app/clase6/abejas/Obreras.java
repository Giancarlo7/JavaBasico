
package app.clase6.abejas;


public class Obreras extends Eusociales {
    
    public Obreras(String tipo, String funcion) {
    this.setTipo(tipo);
    this.setFuncion(funcion);
    }
    
     

    @Override
    public void Genero() {
        System.out.println("Genero: Hembras");
    }

    @Override
    public void CicloDeDesarrollo() {
        System.out.println("Ciclo de Desarrollo: 21 dias");
    }

    @Override
    public void Alimento() {
        System.out.println("Alimento: Miel Especial");
    }
    
}

    
