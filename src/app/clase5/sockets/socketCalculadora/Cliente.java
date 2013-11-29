package app.clase5.sockets.socketCalculadora;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {
public Cliente() {
    
}
    private static BufferedReader c1 = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedReader c2 = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) 
            throws IOException {
            String IP_CALCU = "localhost";
            int PUERTO_CALCU = 9999;
            String sigue = "s";
            while (sigue.equals("s")) {
                try {

                    System.out.println("CALCULADORA BASICA");
                    System.out.print("Operacion a realizar: ");
                    System.out.print("(a+b, a-b, a*b, a/b) \n--> ");
                    String valor = c2.readLine();

                    String resultado = realizar_operacion(IP_CALCU, PUERTO_CALCU, valor);
                    System.out.println("El resultado es: " + resultado);

                } catch (Exception e) {
                    System.out.println(e);

                }
                System.out.print("\nDesea realizar otra operacion? (s/n): ");
                sigue = c1.readLine();
                System.out.print("\n");
            }

            System.out.println("Adios.");
        }

    
    

    static String realizar_operacion(String host, int puerto, String valor) {
        String respuesta = null;

        try {

            Socket socket1 = new Socket(host, puerto);

            DataOutputStream salida = new DataOutputStream(new BufferedOutputStream(socket1.getOutputStream()));
            DataInputStream entrada = new DataInputStream(new BufferedInputStream(socket1.getInputStream()));

            salida.writeUTF(valor);
            salida.flush();

            respuesta = entrada.readUTF();

            try {
                socket1.close();

            } catch (Exception ex) {
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return respuesta;
    }
}