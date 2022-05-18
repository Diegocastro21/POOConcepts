package test;

import interfaces.*;


public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datosMySql = new ImplementacionMySql();
/*        datosMySql.listar();
        datosMySql.insertar();*/
        IAccesoDatos datosOracle = new ImplementacionOracle();
/*        datosOracle.listar();
        datosOracle.insertar();*/

        imprimir(datosMySql);
        imprimir(datosOracle);
    }

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
        datos.insertar();
        datos.actualizar();
        datos.eliminar();
    }
}
