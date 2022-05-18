package test;

import instanceOf.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juanito",5000);
        determinarTipo(empleado);
        Gerente empleado2 = new Gerente("Karla",10000,"Contabilidad");
        determinarTipo(empleado2);
    }

    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
//            ((Gerente) empleado).getDepartamento(); una forma
            Gerente gerente = (Gerente)empleado;// otra forma
            System.out.println("gerente:  " + gerente.getDepartamento());
            //seria un cast
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
            System.out.println("Empleado: "+empleado.getNombre());
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            empleado.toString();
        }

        //poner else if para que no responda verdadero independiente de sus tipos
        // Ir poniendo los tipos especificos primero y luego los mas genricos

    }
}
