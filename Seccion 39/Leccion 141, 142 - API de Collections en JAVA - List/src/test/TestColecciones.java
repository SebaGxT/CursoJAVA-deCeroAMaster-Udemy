/*

Coleccion de tipo List
Un array de tipo List puede crecer dinamicamente por lo que no se debe indicar el tamaño
con add se puede agregar cualquier tipo de elemento.

para iterar la lista se puede recorrer facilmente con foreach


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

        //ForEach
        for (Object elemento : miLista) {
            
            System.out.println("elemento = " + elemento);
            
        }

        //Funcion lambda en JAVA
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        
    }
}
