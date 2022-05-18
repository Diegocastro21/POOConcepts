package test;
import EjerciciosPracticaUdemy.*;

public class PersonaPrueba {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 5000.00,false);
        System.out.println(persona1.getNombre());
        persona1.setNombre("Juan Carlos");
        /*System.out.println("Persona 1 Nombre :" + persona1.getNombre());
        System.out.println("Persona 1 Sueldo :  "+ persona1.getSueldo());
        System.out.println("Persona 1 Eliminado :  "+ persona1.isEliminado());*/
        System.out.println("Persona 1: "+persona1);
        System.out.println("-----------------------------------------------------------\n");
        Persona persona2 = new Persona("Diego Camilo",1200.00,true);
        /*System.out.println("Persona 2 Nombre    :"+persona2.getNombre());
        System.out.println("Persona 2 Sueldo    :"+persona2.getSueldo());
        System.out.println("Persona 2 Eliminado :"+persona2.isEliminado());*/
        //Println llama automaticamente al metodo toString asi que no es necesario poner
        //persona2.toString()
        System.out.println("Persona 2: "+persona2);
        System.out.println("--------------------Cambios Realizados----------------------\n");
        persona2.setNombre("Diego Camilo Castro Oliveros");
        persona2.setSueldo(2000.00);
        persona2.setEliminado(false);
        System.out.println("Persona 2: "+persona2.toString());
        /*System.out.println("Persona 2 Nombre    :"+persona2.getNombre());
        System.out.println("Persona 2 Sueldo    :"+persona2.getSueldo());
        System.out.println("Persona 2 Eliminado :"+persona2.isEliminado());*/

    }
}
