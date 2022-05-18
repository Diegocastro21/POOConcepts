package Laboratorios;

public class Prueba {
    public static void main(String[] args) {
        Caja caja1 = new Caja(3, 2, 6);
        System.out.println("El Volumen de la caja es: "+ caja1.calcularVolumen());
        Caja caja2 = new Caja(9, 17, 30);
        System.out.println("El volumen de la caja 2 es: "+ caja2.calcularVolumen());
        Caja caja3 = new Caja(6, 9, 13);
        System.out.println("El Volumen de la caja 3 es: "+ caja3.calcularVolumen());
        Caja caja4 = new Caja(12, 14, 16);
        System.out.println("El volumen de la caja 4 es: "+ caja4.calcularVolumen());

    }

}
