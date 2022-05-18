package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
/*        System.out.println("Dia 1: "+ Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);
        indicarDiaSemana(Dias.JUEVES);
        indicarDiaSemana(Dias.SABADO);*/

        System.out.println("Continente no.4: "+ Continentes.AMERICA);
        System.out.println("Numero de paises 4to continente: "+Continentes.AMERICA.getPaises());
        System.out.println("Continente no.4: "+ Continentes.AFRICA);
        System.out.println("Numero de paises 4to continente: "+Continentes.AFRICA.getPaises());
        System.out.println("Continente no.4: "+ Continentes.EUROPA);
        System.out.println("Numero de paises 4to continente: "+Continentes.EUROPA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch(dias){
            case LUNES -> System.out.println("Primer dia de la semana");
            case MARTES -> System.out.println("Segundo dia de la semana");
            case MIERCOLES -> System.out.println("Tercer dia de la semana");
            case JUEVES -> System.out.println("cuarto dia de la semana");
            case VIERNES -> System.out.println("quinto dia de la semana");
            case SABADO -> System.out.println("Sexto dia de la semana");
            case DOMINGO -> System.out.println("Ultimo dia de la semana");
        }
    }

}
