package test;

import EjerciciosPracticaUdemy.Cliente;
import EjerciciosPracticaUdemy.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",5000.0);
        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(false,"Diego",'M', 18, "El monte everest");
        System.out.println("cliente1 = " + cliente1);

        Cliente cliente2 = new Cliente(true,"Federico",'M', 19, "villavicencio");
        Cliente cliente3 = new Cliente(false,"Messi",'M', 11, "canada");
        Cliente cliente4 = new Cliente(true,"Ronaldo",'M', 45, "argentina");
        Cliente cliente5 = new Cliente(true,"Mbappe",'M', 12, "peru");
        Cliente cliente6 = new Cliente(false,"Nacho",'M', 30, "nuevo mexico");
        Cliente cliente7 = new Cliente(true,"Yeris",'F', 34, "alburqueque");

        System.out.println("cliente2 = " + cliente2);
        System.out.println("cliente3 = " + cliente3);
        System.out.println("cliente4 = " + cliente4);
        System.out.println("cliente5 = " + cliente5);
        System.out.println("cliente6 = " + cliente6);
        System.out.println("cliente7 = " + cliente7);
    }
}
