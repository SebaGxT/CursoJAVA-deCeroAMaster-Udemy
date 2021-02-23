/*

Se definen variables de tipo interface para realizar un codigo mas generico.
no podemos generar objetos de tipo interface por ser abstracta
para esto se debe tomar una implementacion

*/
package test;

import accesodatos.*;

public class TestInterfaces {
    
    public static void main(String[] args) {
        
        IAccesoDatos datos = new ImplementacionMySql();
        
        imprimir(datos);
        
        datos = new ImplementacionOracle();
        
        imprimir(datos);
        
    }
    
    public static void imprimir(IAccesoDatos datos){
        
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
        
    }
    
}
