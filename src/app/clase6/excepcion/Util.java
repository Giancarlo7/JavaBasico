
package app.clase6.excepcion;



public class Util {
    
    public static void main(String[] args) {
       Util.Excepcion();
        
        
    }
    
     public static void Excepcion() {

        try {
                       
            int[] X = new int[10];
            for (int i = 0; i < 10; i++) {
                
            }
          
            X[20] = 100;
        } catch (Exception e) {
            System.out.println("FUERA DE RANGO DE EXECEPCION");
    
            
        }

    }
}
    

