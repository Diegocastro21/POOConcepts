package test;

public class TestOperadorTenario {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int numeroMayor = 0;
        numeroMayor = i > j ? i : j;
        System.out.println("numeroMayor: " + numeroMayor);
        System.out.println("numeroMayor: " + ((i > j) ? "i es mayor" : "j es mayor"));

        /*if (i > j) {
            numeroMayor = i;
        } else {
            numeroMayor = j;
        }*/

    }
}
