package EjerciciosPracticaUdemy;

public class CajaGenerics <T> {

    T elemento;

    CajaGenerics(T elemento){
        this.elemento = elemento;
    }

    T obtenerObjeto(){
        return elemento;
    }

    <V> boolean perteneceElContenidoMismaClase(V otroObjeto){
        return elemento.getClass() == otroObjeto.getClass();
    }
}
