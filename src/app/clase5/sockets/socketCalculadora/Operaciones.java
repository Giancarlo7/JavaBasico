package app.clase5.sockets.socketCalculadora;

import java.lang.Math.*;

public class Operaciones {

    double num1;
    float num;
    float num2;
    float num3;
    float resultado;

    Operaciones(String valor1, String valor2) {
        num2 = Float.parseFloat(valor1);
        num3 = Float.parseFloat(valor2);
    }

    

    float suma() {
        num = num2 + num3;
        return num;

    }

    float resta() {
        num = num2 - num3;
        return num;
    }

    float multiplicacion() {
        num = num2 * num3;
        return num;
    }

    float division() {
        num = num2 / num3;
        return num;
    }

    double raiz() {
        num1 = Math.sqrt(num);
        return num1;

    }
}