package EjerciciosPracticaUdemy;

public class Main {
    public static void main(String[] args) {

        CajaGenerics<String> caja1 = new CajaGenerics<>("Planeta");

        Integer numero = 5;

        CajaGenerics<Integer> caja2 = new CajaGenerics<>(numero);

        String animal = "Perro";

        System.out.println("Pertenece a la misma clase : "+ caja1.perteneceElContenidoMismaClase(animal));
        System.out.println("Pertenece a la misma clase : "+ caja2.perteneceElContenidoMismaClase(animal));
    }
}
