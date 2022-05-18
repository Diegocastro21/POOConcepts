package Laboratorios;

public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Se esta ejecutando el constructor vacio");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen() {
        int volumen = this.ancho * this.alto * this.profundo;
        return volumen;
    }
}
