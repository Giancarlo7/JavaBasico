
package app.clase4.hilos;

public class HiloImplementacion implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print("" + i);
        }
    }

       
}
