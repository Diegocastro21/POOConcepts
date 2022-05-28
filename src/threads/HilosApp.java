package threads;

public class HilosApp {

    public static void main(String[] args) {

        THilo hilo = new THilo(1);
        // hilo.run(); //este no se ejecuta concurrentemente solo se ejcuta la accion
        hilo.start();


        // trabajar con Runnable te permite implemetar de otras clases mas
        // en cambio con extends de Thread no te lo permite extender de otras
        Thread hiloRunnable = new Thread(new RHilos(2));

        Runnable r = new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 100; i++) {
                    System.out.println("[A] Hilo ejecutandose");
                }

            }
        };
        Thread hilo3 = new Thread(r);
        hilo3.start();
        hiloRunnable.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("Ejecutandose hilo MAIN: "+ i);
        }
        System.out.println("\n\n\n\n");





    }
}
