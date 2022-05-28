package threads;

public class RHilos implements Runnable {

    private int id;

    public RHilos (int id){
        this.id = id;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Ejecutandose con Runnable --> id = " + id);
        }
    }
}
