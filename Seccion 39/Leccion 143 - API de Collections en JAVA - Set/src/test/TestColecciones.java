/*

Coleccion de tipo Set

El set es muy similar a una lista solamente que set no mantiene el orden en el que ingresen los elementos
por lo que seria coincidencia que los imprima en orden

Se agregan elementos de forma dinamica por lo que no se debe indicar una cantidad para el array

List y Set utilizan el metodo add que se encuentra definido en la clase padre Collection

Un set es mas rapido en realizar operaciones porque no guarda el orden al agregar los elementos

En el tipo List se pueden  duplicar elementos
miLista.add("Domingo");
miLista.add("Domingo");

en el tipo Set no se pueden duplicar los elementos, los duplicados no los agrega simplemente los desecha



 */
package test;

import java.util.*;

public class TestColecciones {
    
    public static void main(String[] args) {
        
        List miLista = new ArrayList();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        imprimir(miLista,"Mi Lista:");
        
        Set miSet = new HashSet();
        
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        
        imprimir(miSet,"Mi Set:");
        
        
        
    }
    
    public static void imprimir(Collection coleccion,String a){
        
        coleccion.forEach(elemento -> {
            
            System.out.println(a + " " + elemento);
            
        });
        
    }
    
}
