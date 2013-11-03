package app.clase2.estatico;


public class estatico {
 
    static int contador;
    
    public estatico(){
        ++contador;
    } 
    
    public static double dolaraEuro(double dolar) {
    double euro = dolar * 0.81559;
    return euro;

    }
    
}
