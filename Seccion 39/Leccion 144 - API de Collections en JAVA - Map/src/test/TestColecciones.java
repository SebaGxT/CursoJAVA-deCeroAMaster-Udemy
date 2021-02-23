/*

Coleccion de tipo Map

Map no hereda de la clase collections sino que hereda de la clase Map
Para agregar elementos al Map se utiliza el metodo put en el cual se debe agregar una llave y un valor asociado
a esa llave, esta llave es de tipo Object por lo que puede ser de cualquier tipo


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
        
        //imprimir(miLista,"Mi Lista:");
        
        Set miSet = new HashSet();
        
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        
        //imprimir(miSet,"Mi Set:");
        
        Map miMapa = new HashMap();
        
        //Si se duplica la llave se reemplaza por el ultimo valor ingresado
        miMapa.put("Valor1", "Sebastian");
        miMapa.put("Valor2", "Marly");
        miMapa.put("Valor3", "Barby");
        miMapa.put("Valor3", "Jose");
        
        //get regresa un tipo object por lo que es 
        //necesario convertirlo a String en este caso
        String elemento = (String)miMapa.get("Valor1");
        System.out.println("elemento = " + elemento);
        
        //Para traer todos los elementos del mapa se puede usar keySet
        //No garantiza que traiga los elementos en el orden agregado
        //En este caso solo trae los key y no los valores que contiene
        imprimir(miMapa.keySet(),"Mi Mapa Keys:");
        imprimir(miMapa.values(),"Mi Mapa Valores:");
        
        
    }
    
    public static void imprimir(Collection coleccion,String a){
        
        coleccion.forEach(elemento -> {
            
            System.out.println(a + " " + elemento);
            
        });
        
    }
    
}
