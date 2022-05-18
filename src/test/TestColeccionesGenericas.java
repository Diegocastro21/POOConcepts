package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        String elemento = miLista.get(0);
        System.out.println("Elemento: "+elemento);
        imprimir(miLista);

        System.out.println("_____________________________________ ");
        Set<String> miset = new HashSet<>();

        miset.add("Lunes");
        miset.add("Martes");
        miset.add("Miercoles");
        miset.add("Jueves");
        miset.add("Viernes");
        miset.add("Sabado");
        miset.add("Domingo");
        imprimir(miset);

        Map<String, String> mimapa = new HashMap<>();

        mimapa.put("Valor", "Juan");
        mimapa.put("Valor2", "Karla");
        mimapa.put("Valor3", "Rosario");
        //Si se pone un valor duplicado se sustituye por el  nuevo
        System.out.println("_____________________________________ ");
        imprimir(mimapa.keySet());
        imprimir(mimapa.values());

    }
    public static void imprimir(Collection<String> coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);;
        });
    }

}
