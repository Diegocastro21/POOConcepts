package threads;

public class PrincipalThreads {
    public static void main(String[] args) throws InterruptedException {


        /*
        * activeCount()
        * Devuelve una estimación del número de subprocesos activos
        * en el grupo de subprocesos del subgrupo actual.
        * */
        System.out.println(Thread.activeCount());


        /*
        * currentThread()
        * Devuelve una referencia al objeto de hilo
        * que se está ejecutando actualmente.
        * getName()
        * Devuelve el nombre de este hilo.
        * */
        System.out.println(Thread.currentThread().getName());

        /*
        * getPriority()
        * Devuelve la prioridad de este hilo.
        * setPriority()
        * Cambia la prioridad de este hilo.
        * */
        //Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getPriority());

        /*
        * isAlive()
        * Comprueba si este hilo está vivo
        * */
        System.out.println(Thread.currentThread().isAlive());

        /*
        * sleep()
        * Hace que el hilo que se está ejecutando actualmente entre en reposo
        * (cesa temporalmente la ejecución)
        * durante el número especificado de milisegundos, sujeto a
        * la precisión y exactitud de los temporizadores y programadores del sistema.
        * */

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            //Se añade para manejar esta excepcion el throws InterruptedException
            Thread.sleep(1000);
        }
        System.out.println("YOU ARE DONE");

    }
}

