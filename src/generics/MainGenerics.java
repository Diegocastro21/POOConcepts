package generics;

public class MainGenerics {
    public static void main(String[] args) {

        ClaseGen <Integer> objeto1 = new ClaseGen<>(1);
        objeto1.tipoClase();

        ClaseGen <String> objeto2 = new ClaseGen<>("cadena");

        objeto2.tipoClase();

        // trabajar con diferentes tipos de datos sin pasar completamente nada
        System.out.println(objeto1.metodoGen("hola a 1"));
        System.out.println(objeto2.metodoGen(10));
    }
}

