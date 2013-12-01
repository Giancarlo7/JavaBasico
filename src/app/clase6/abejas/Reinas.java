
package app.clase6.abejas;


public class Reinas extends Eusociales{

    public Reinas(String tipo, String funcion) {
    this.setTipo(tipo);
    this.setFuncion(funcion);
    }
    
     

    @Override
    public void Genero() {
        System.out.println("Genero: Hembras");
    }

    @Override
    public void CicloDeDesarrollo() {
        System.out.println("Ciclo de Desarrollo: 16 dias");
    }

    @Override
    public void Alimento() {
        System.out.println("Alimento: Miel Especial");
    }
    
}
