package app.clase3.excepcion;

public class Excepcion {

    public static void main(String[] args) {
        Excepcion.testException3();
    }

    public static void testException3() {
        
        try {
                
                int[] numeros = {11,2,34,4,6,7,8,98,4,4,1};
        
        for (int i = 0; i < 11; i++) {
            int j = numeros[i]; 
                System.out.println(j);
             }
        
        } catch (NullPointerException e) {
                System.out.println("ERROR ARRAY NULO");
            }
        }
        
        
        
   
    
     public static void testExcepcion() {

        try {
            int dividendo = 10;
            int divisor = 0;

            int resultado = dividendo / divisor; // <------ probando error matemat , ArithmeticException

            int[] array = new int[2];
            //array[10] = 100; // <------ error Array  , ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR ARRAY");


        } catch (ArithmeticException e) {
            System.out.println("ERROT MATEMAT");

        } finally {
            System.out.println("FIN DE PROGRAMA");

        }

    }
}