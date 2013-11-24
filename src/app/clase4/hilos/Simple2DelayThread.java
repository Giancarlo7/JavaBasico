package app.clase4.hilos;

public class Simple2DelayThread extends Thread {

    private long delay;
    private String nombre;

    public Simple2DelayThread( String nombre, long delay) {
        this.delay = delay;
        this.nombre = nombre;
    }

    public void run() {

        for (int i = 0; i < 5; i++) {

            System.out.println("Nombre: " + nombre + "Delay" + delay);
            try {
                Thread.sleep(delay);

            } catch (InterruptedException ex) {
                System.out.println("ERROR: " + ex.getMessage());
}
            
            }
        }
    }
            
            
