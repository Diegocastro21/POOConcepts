package medium;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3, 4, 6 ,5 ,6 );
        imprimirNumeros(5,7,8,7);
        variosParametros("Consolata", 1, 3 , 4, 5, 5 );

    }

    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento  "+(i+1)+" = " + numeros[i]);
        }
    }

    private static void variosParametros(String nombre, int ... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }

}
