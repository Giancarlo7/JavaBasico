package aritmetico;

public class AppAritmetica {

    public static void main(String [] args) {
        
        OperacionesAritmeticas operacion = new OperacionesAritmeticas ();
        double suma = operacion.sumar (10d, 20d);
        System.out.println(suma);
        
        int mayor = operacion.getMax(10, 11);
        System.out.println(operacion);
    }
}
