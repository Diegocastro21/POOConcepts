package test;

import polimorfismo.Empleado;
import polimorfismo.Gerente;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("Empleado = "+empleado.obtenerDetalles());

        imprimir(empleado);

        Gerente gerente = new Gerente("Karla",1000, "Contabilidad");
//        System.out.println("Gerente "+ gerente.obtenerDetalles());
        imprimir(gerente);
    }

    public static void imprimir(Empleado empleado){
        System.out.println("Empleado: "+ empleado.obtenerDetalles());
    }
}
