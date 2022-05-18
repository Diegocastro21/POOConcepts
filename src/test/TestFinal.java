package test;

import EjerciciosPracticaUdemy.PersonaFinal;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 6; Una vez asignado su valor no se puede modificar
        System.out.println("PersonaFinal.MI_CONSTANTE = " + PersonaFinal.MI_CONSTANTE);
    
        final PersonaFinal persona1 = new PersonaFinal();
        
        persona1.setNombre("Juan alimanña");
        System.out.println("persona1 = " + persona1.getNombre());
        
    }
    
}
