package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "/Applications/UdemyToMaster/prueba.txt";

        //crearArchivo(nombreArchivo);
        anexarArchivo(nombreArchivo, "Manejo de archivos desde java");
        anexarArchivo(nombreArchivo, "SOBRESCRIBIENDO EL ARCHIVO .TXT");

        leerArchivo(nombreArchivo);
    }
}
