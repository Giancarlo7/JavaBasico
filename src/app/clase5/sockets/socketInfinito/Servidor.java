package app.clase5.sockets.socketInfinito;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int port;

    public Servidor(int port) {
        this.port = port;
    }

    public void ejecutar() {
        try {
// Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado...");
            
        while (true){
            
            Socket cliente = server.accept();
// Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
// COMUNICACION 1
            out.println("SERVIDOR: usted debe 100 soles ");
// COMUNICACION 2
            String resp2 = in.readLine();
            System.out.println(resp2);
            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }

   } 

}

