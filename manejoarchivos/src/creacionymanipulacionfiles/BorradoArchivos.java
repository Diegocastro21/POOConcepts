package creacionymanipulacionfiles;

import java.io.File;

public class BorradoArchivos {
    public static void main(String[] args) {
        File file = new File("Elarchivo.txt");
        System.out.println("El archivo se "+ (file.delete() ? "borro correctamente" : "no se borro"));
    }
}
