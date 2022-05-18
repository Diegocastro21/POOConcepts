package test;

import java.util.*;
public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        
        miLista.add("lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        imprimir(miLista);
        /*for(Object elemento : miLista){
            System.out.println("elemento = " + elemento);
        }
        System.out.println("---------------------------");
        miLista.forEach(elemeto -> {
            System.out.println("elemeto = " + elemeto);
        });*/
        System.out.println("_____________________________________ ");
        Set miset = new HashSet();

        miset.add("Lunes");
        miset.add("Martes");
        miset.add("Miercoles");
        miset.add("Jueves");
        miset.add("Viernes");
        miset.add("Sabado");
        miset.add("Domingo");
        imprimir(miset);

        Map mimapa = new HashMap();

        mimapa.put("Valor","Juan");
        mimapa.put("Valor2","Karla");
        mimapa.put("Valor3","Rosario");

        String elemento = (String) mimapa.get("Valor");
        System.out.println("_____________________________________ ");
        imprimir(mimapa.keySet());
        imprimir(mimapa.values());
    }

    public static void imprimir(Collection coleccion){
        /*for (Object elemento: coleccion) {
            System.out.println("elemento = " + elemento);
        }*/
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);;
        });
    }
}
