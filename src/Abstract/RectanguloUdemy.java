package Abstract;

public class RectanguloUdemy extends FiguraGeometrica{

    public RectanguloUdemy(String tipofigura){
        super(tipofigura);
    }

    // Implementado el comportamiento de este metodo de la clase padre
    public void dibujar(){
        System.out.println(" Se imprime un: "+this.getClass().getSimpleName());
    }

}
