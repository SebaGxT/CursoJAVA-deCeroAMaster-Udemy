/*

Todas las clases heredan de la clase Object este es el padre de todas las clases
esta clase ya define algunos metodos y sus comportamientos

algunos de estos metodos son:

-toString(): String
-equals(): boolean --> Compara el contenido de dos objetos
equals se va a encargar de comparar los atributos de la clases para verificar si los objetos son iguales en contenido
-hashCode(): int --> Asigna un valor de tipo entero a cada objeto generado a partir de los valores de cada uno de los
atributos de la clase
asi que se genera un entero unico y se compara para saber si los objetos son iguales
Si vamos a implementar el metodo hashCode tambien debe sobreescribirse el metodo equals ya que no hacerlo cuando 
se manejen algunas estructuras de datos como puede ser HashMap, HashSet, Hashtable u otro tipo de colecciones
podrian tener inconsistencias cuando se esten aplicando de manera automatica algoritmos de ordenamiento por lo tanto 
siempre es mejor implementar ambos metodos.

Las comparaciones de cadenas son casesensitive no es lo mismo Sebastian con mayuscula que sebastian con minuscula
puede darse la coincidencia de que hashcode asigne el mismo valor sin los objetos ser iguales

 */
package test;

import domain.*;

public class TestClaseObject {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Sebastian",42000);
        Empleado empleado2 = new Empleado("Sebastian",42000);
        
        //Al utilizar == se compara la referencia en memoria de los objetos no su contenido
        if(empleado1 == empleado2){
            
            System.out.println("Tienen la misma referencia en memoria");
            
        }else{
            
            System.out.println("Tienen distinta referencia en memoria");
            
        }
        
       if (empleado1.equals(empleado2)){
           
           System.out.println("Los objetos son iguales en contenido");
           
       }else{
           
           System.out.println("Los objetos son distintos en contenido");
           
       }
       
       if(empleado1.hashCode() == empleado2.hashCode()){
           
           System.out.println("El valor hashcode es igual");
           
       }else{
           
           System.out.println("El valor hashcode es distinto");
           
       }
        
   
    }
    
}
