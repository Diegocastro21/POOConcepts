package EjerciciosPracticaUdemy;

public class PersonaStatic {

    private int idPersona;
    private String nombre;
    private static int contadorPersona;

    public PersonaStatic(String nombre) {
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        PersonaStatic.contadorPersona++;

        this.idPersona = PersonaStatic.contadorPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        PersonaStatic.contadorPersona = contadorPersona;
    }

    @Override
    public String toString() {
        return "PersonaStatic{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
