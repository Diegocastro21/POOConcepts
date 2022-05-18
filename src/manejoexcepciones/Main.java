package manejoexcepciones;

public class Main {
    public static void main(String[] args) {

        try{
            int numero = Integer.parseInt("x");
            System.out.println("Bloque 1");
//            int numero = Integer.parseInt("x");
        }catch (Exception e){
            System.out.println("Bloque 2");
        }finally {
            System.out.println("Bloque 3");
        }


    }
}
