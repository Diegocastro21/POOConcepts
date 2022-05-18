package test;

import JavaBeans.PersonaBeans;

public class TestJavaBeans {
    public static void main(String[] args) {
        PersonaBeans persona = new PersonaBeans();
        
        persona.setNombre("Juan");
        persona.setApellido("Perez");

        System.out.println("persona = " + persona);

        System.out.println(" Persona nombre: "+persona.getNombre());
        System.out.println("Persona apellido: "+persona.getApellido());
    }
}
