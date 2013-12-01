package app.clase5.sockets.socketHilo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServidorHilo extends Thread {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {
        try {

            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                    calculadora(out, in);

            in.close();
            out.close();
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente != null) {
                    cliente.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void calculadora(PrintWriter out, BufferedReader in) throws IOException {

        out.println("SERVIDOR: Bienvenido Como te llamas?");

        String nombre = in.readLine();
        System.out.println(nombre);

        String operacion = in.readLine();
        Double operador1 = Double.parseDouble(in.readLine());
        Double operador2 = Double.parseDouble(in.readLine());

        if (operacion.equals("m")) {
            out.println("Servidor multiplicacion");
            out.println(operador1 * operador2);
        } else if (operacion.equals("m")) {
            out.println("Servidor suma");
            out.println(operador1 + operador2);
        } else if (operacion.equals("m")) {
            out.println("Servidor resta");
            out.println(operador1 - operador2);
        } else if (operacion.equals("m")) {
            out.println("Servidor division");
            out.println(operador1 / operador2);
        }





    }
}
