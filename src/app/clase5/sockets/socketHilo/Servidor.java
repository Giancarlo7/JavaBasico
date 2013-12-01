package app.clase5.sockets.socketHilo;

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
            ServerSocket socket = new ServerSocket(port);
            System.out.println("Servidor iniciado...");
            
            while (true) {
                
                Socket socketcliente = socket.accept();
                ServidorHilo server = new ServidorHilo(socketcliente);
                server.start();
            }
        } catch (Exception e) {
            System.out.println("Error socket Server");
           
        }
    }
}
