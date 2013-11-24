package app.clase4.hilos;

public class MemoriaHilo extends Thread {

    public void run() {

        for (int i = 0; i < 5; i++) {

            try {
                listMemoria();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }

    public void listMemoria() {


        long mem0 = Runtime.getRuntime().totalMemory();
        long mem1 = Runtime.getRuntime().freeMemory();
        long mem2 = Runtime.getRuntime().availableProcessors();
        long mem3 = Runtime.getRuntime().maxMemory();
        System.out.println(mem0);
        System.out.println(mem1);
        System.out.println(mem2);
        System.out.println(mem3);
    }
}
