package test;

import EjerciciosPracticaUdemy.PersonaStatic;

public class PersonaPruebaStatic {

    private int contador;
    public static void main(String[] args) {
        PersonaStatic persona1 = new PersonaStatic("Juan");
//        System.out.println("persona1 = " + persona1);
        PersonaStatic persona2 = new PersonaStatic("Karla");
//        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
    }
    public static void imprimir(PersonaStatic persona) {
        System.out.println("persona = " + persona);
    }

    public int getContador() {
        imprimir(new PersonaStatic("Frank Kafka"));
        return this.contador;
    }
}
