
package app.clase2.aritmetico;

public class OperacionesAritmeticas {

        public double sumar(double a, double b){
            double resultado = a + b;
            return resultado;
        }
public int getMax(int a, int b) {
int mayor = a;
if (a > b) {
mayor = a;
} else if (a == b) {
mayor = 0; //por ser iguales
} else {
mayor = b;
}
return mayor;
}
public float getMax(float a, float b) {
float mayor = a;
if (a > b) {
mayor = a;
} else if (a == b) {
mayor = 0; //por ser iguales
} else {
mayor = b;
}
return mayor;
}

}

