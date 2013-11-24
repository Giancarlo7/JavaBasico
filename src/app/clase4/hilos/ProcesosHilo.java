package app.clase4.hilos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcesosHilo extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {

            try {
                listProcess();  
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            
        }
    }

    public void listProcess() {

        try {
            Process proceso = Runtime.getRuntime().exec("tasklist");
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                    proceso.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(
                    proceso.getErrorStream()));
            String s = null;
            System.out.println("Here is the standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}