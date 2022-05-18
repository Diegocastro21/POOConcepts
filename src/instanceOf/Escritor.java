package instanceOf;

public class Escritor extends Empleado{

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetallesI(){
        return super.obtenerDetallesI()+ ", Tipo de escritura: "+tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" +
                "tipoEscritura=" + tipoEscritura +
                '}' +super.toString();
    }

    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
