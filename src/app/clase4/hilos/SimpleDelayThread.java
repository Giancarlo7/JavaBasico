package app.clase4.hilos;

public class SimpleDelayThread extends Thread {

    public void run() {

        for (int i = 0; i < 50; i++) {

            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
