package test;

import instanceOf.Empleado;
import instanceOf.Escritor;
import instanceOf.TipoEscritura;

public class TestConversionObjetos {
    public static void main(String[] args) {

        Empleado empleado;
        // asignamos untipo de referencia del hijo a la clase padre upcasting
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);


        System.out.println(empleado.obtenerDetallesI());

        // referencia de un tipo padre un tipo hijo downcasting
        ((Escritor)empleado).getTipoEscritura();


    }
}
