
package app.clase3.interfases.posicion;

public class Teodolito {
    
   public static void main(String[] args){
       
       Position carro = new Auto(20, 30);
       Position gian = new Persona(50, 20);
       
       Teodolito.getDistancia(carro, gian);
       
   }
    
    
    
    public static void getDistancia(Position p1, Position p2) {
        
        double d1 = p1.getLatitud() - p2.getLatitud();
        
        double d2 = p1.getLongitud() - p2.getLongitud();
        
        System.out.println(Math.sqrt(d1*d1+d2*d2));
        
               
    }
            
}
