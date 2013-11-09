
package app.clase3.objeto;

import java.util.Date;


public class Pruebas {
   public static void main (String [] args) {
    Date fecha1 = new Date();
    Date fecha2 = fecha1;
    
    if(fecha1==fecha2) {
            System.out.println("iguales");
}
    if(fecha1.equals(fecha2)){
        System.out.println("las fechas son iguales");
    }
}
   }
   
