package test;

import generics.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {

        //Indicar tanto el tipo como un objeto compatible
        ClaseGenerica<Integer>  objetoInt= new ClaseGenerica<>(15);
        objetoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica<>("Juan");
        objetoString.obtenerTipo();
    }
}
