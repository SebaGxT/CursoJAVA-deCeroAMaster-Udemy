/*

Cuando se trabaja con List genericos se debe indicar el tipo de dato con el que se va a trabajar
                       
                        Del lado derecho es redundante Agregar <String>, solamente se agrega la anotacion de diamante <>
List<String> miLista = new ArrayList<>();

una vez hecho esto el metodo add ya no indica que va a almacenar tipo object sino que especifica el tipo de 
dato a almacenar

add(String e)

esto permite que se puedan recuperar los datos sin tener que convertirlos previamente de object al tipo de dato
a almacenar
Se obtiene con el metodo get indicandole el indice de posicion del dato a recuperar


 */
package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);

//        imprimir(miLista,"Mi Lista:");
        Set<String> miSet = new HashSet<>();

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");

//        imprimir(miSet,"Mi Set:");
//Para el Map se debe indicar el tipo para la llave y el valor, pueden ser de distintos tipos
        Map<String, String> miMapa = new HashMap<>();
        
        miMapa.put("Valor1", "Sebastian");
        miMapa.put("Valor2", "Marly");
        miMapa.put("Valor3", "Barby");

        String elementoMapa = miMapa.get("Valor1");
        System.out.println("elemento = " + elementoMapa);

        imprimir(miMapa.keySet(), "Mi Mapa Keys:");
        imprimir(miMapa.values(), "Mi Mapa Valores:");

    }

    //Para el argumento solicitado por el metodo tambien debe especificarse el tipo de dato a trabajar
    public static void imprimir(Collection<String> coleccion, String a) {

//        coleccion.forEach(elemento -> {
//
//            System.out.println(a + " " + elemento);
//
//        });
//ForEach
        for (String elemento : coleccion) {

            System.out.println(a + " " + elemento);

        }

    }

}
