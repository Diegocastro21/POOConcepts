package EjerciciosPracticaUdemy;

public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    //getter and setter del nombre
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //getter and setter de sueldo
    public double getSueldo() {
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    //getter and setter del eliminado
    public boolean isEliminado(){
        return this.eliminado;
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

    // Metodo toString
    public String toString() {
        return "Persona [ nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]";
    }
}
