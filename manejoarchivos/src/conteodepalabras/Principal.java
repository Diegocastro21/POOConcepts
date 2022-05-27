package conteodepalabras;

import java.io.File;

public class Principal {
    public static void main(String[] args) {
        ConteoPalabras conteo = new ConteoPalabras();

        File file = new File("conteo.txt");
        String[] lines = conteo.readFile(file);

        int words = lines.length;
//        System.out.println(words);

        boolean result = conteo.showResult(words, lines);
        System.out.println("Todo salio "+(result ? "Bien" : "Mal , Hubieron problemas en la ejecucion :("));
    }
}
