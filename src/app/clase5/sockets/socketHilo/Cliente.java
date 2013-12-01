package app.clase5.sockets.socketHilo;

import app.clase5.sockets.socketBasico.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

    private String host;
    private int port;

    public Cliente(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);

            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

            String msg = in.readLine();
            System.out.println(msg);

            out.println("CLIENTE: David Rodríguez");
            out.println("m");
            out.println(9);
            out.println(9);
            
            msg = in.readLine();
            System.out.println(msg);           
            msg = in.readLine();
            System.out.println(msg);
          
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}

