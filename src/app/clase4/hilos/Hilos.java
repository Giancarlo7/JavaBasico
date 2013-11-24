package app.clase4.hilos;

public class Hilos {

    public static void main(String[] args) {
        Hilos.testMemoriaHilo();

    }

    public static void testHiLoHerencia() {
        HiloHerencia hilo = new HiloHerencia();
        hilo.start();
    }

    public static void testHiLoInterface() {
        HiloImplementacion hilo = new HiloImplementacion();

        Thread runner = new Thread(hilo);
        runner.start();

    }

    public static void testSimpLeDelayHilo() {
        SimpleDelayThread hilo = new SimpleDelayThread();
        hilo.start();


    }

    public static void testSimpLeDelay() {
        long delay1 = (long) (Math.random() * 2000);

        Simple2DelayThread delay = new Simple2DelayThread("gian", delay1);
        delay.start();

    }

    public static void testPrioridad() {

        Simple2DelayThread delayJose = new Simple2DelayThread("Jose", 0);
        Simple2DelayThread delayLuis = new Simple2DelayThread("Luis", 0);

        delayLuis.setPriority(Thread.MAX_PRIORITY);
        delayJose.setPriority(Thread.MIN_PRIORITY);

        delayJose.start();
        delayLuis.start();

    }

    public static void testProcesosHilo() {

        ProcesosHilo hilo = new ProcesosHilo();
        hilo.start();
    }

    public static void testMemoriaHilo() {

        MemoriaHilo hilo = new MemoriaHilo();
        hilo.start();
    }
}