package app.clase5.sockets.socketCalculadora;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {

    public static void main(String[] args) {

        int PUERTO_CALCU = 9999;
        String error = "no hay operando";
        Socket socket = null;
        ServerSocket serverSocket = null;
        String[] lista;
        String resultado = null;
        
        try {

            serverSocket = new ServerSocket(PUERTO_CALCU);
        } catch (Exception e) {

            System.out.println("Error al crear un socket");
            return;
        }
        while (true) {
            try {

                System.out.println("Servidor Calculadora");

                socket = serverSocket.accept();

                System.out.println("Esperando operaciones a realizar: ");

                DataOutputStream salida = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
                DataInputStream entrada = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

                String valor = entrada.readUTF();

                if (valor.indexOf("+") != -1) {
                    lista = valor.split("\\+");
                    Operaciones operar = new Operaciones(lista[0], lista[1]);
                    System.out.println("La suma de " + valor + " es: ");
                    resultado = String.valueOf(operar.suma());

                } else if (valor.indexOf("-") != -1) {
                    lista = valor.split("\\-");
                    Operaciones operar = new Operaciones(lista[0], lista[1]);
                    System.out.println("La resta de " + valor + " es: ");
                    resultado = String.valueOf(operar.resta());

                } else if (valor.indexOf("*") != -1) {
                    lista = valor.split("\\*");
                    Operaciones operar = new Operaciones(lista[0], lista[1]);
                    System.out.println("La multiplicacion de " + valor + " es: ");
                    resultado = String.valueOf(operar.multiplicacion());
                } else if (valor.indexOf("/") != -1) {
                    lista = valor.split("\\/");
                    Operaciones operar = new Operaciones(lista[0], lista[1]);
                    System.out.println("La division de " + valor + " es: ");
                    resultado = String.valueOf(operar.division());

                } else {
                    System.out.println(error);

                }
                System.out.println(resultado);

                salida.writeUTF(resultado);

                System.out.print("\nEnviando respuesta: ");
                salida.flush();
                System.out.println("OK\n");

                try {

                    socket.close();
                } catch (IOException ex) {
                }
            } catch (Exception e) {
                System.out.println("Cerrando la conexion del socket ...");
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException ex) {
                    }
                }
            }
        }
    }
}
