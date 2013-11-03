
package app.clase2.estatico;

public class Appestatico {
    
    public static void main(String[] args) {
        
        Appestatico.runMetodoestatico();
        Appestatico.runAtributoestatico();       
    }
    public static void runMetodoestatico (){
       
        double euro = estatico.dolaraEuro(10d);
        System.out.println(euro);
    }
    public static void runAtributoestatico (){
               
        estatico estaUn = new estatico();
        estatico estaDo = new estatico();
        estatico estaTre = new estatico();
        System.out.println(estatico.contador);
       
    }
    
}
