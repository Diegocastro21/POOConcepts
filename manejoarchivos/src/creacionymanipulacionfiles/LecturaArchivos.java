package creacionymanipulacionfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivos {
    public static void main(String[] args) {
        File file = new File("archivo.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Excepcion al abrir archivos "+ e);
        }
    }
}

