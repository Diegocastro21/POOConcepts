package creacionymanipulacionfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacionArchivos {
    public static void main(String[] args) {
        File folder = new File("folder");
        // en Mac os es / y en windows es \\ para buscarle un directorio al archivo creado
        File file = new File("folder/Elarchivo.txt");
        try{
            boolean folderCreated = folder.mkdir();
            boolean fileCreated = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Aprendiendo a manejar archivos");
            fileWriter.close();
            System.out.println("El archivo "+ (fileCreated && folderCreated ? "se creo correctamente" : " ya existe"));
        }catch (IOException e){
            System.out.println("Excepcion al crear el archivo "+e);
        }
    }
}
