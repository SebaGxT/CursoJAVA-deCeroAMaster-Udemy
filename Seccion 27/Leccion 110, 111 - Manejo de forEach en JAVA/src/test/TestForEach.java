package test;

import domain.Persona;

/*

ForEach es un for mejorado que simplifica la forma en que se recorren los arreglos o colecciones, listas, set o map


*/

public class TestForEach {

    public static void main(String[] args) {
        
        int edades[] = {5,6,8,9};
        
        //Se define un for al que se le crea una variable que almacena cada uno de los valores del arreglo
        //Por lo tanto esta variable debe ser del mismo tipo que el valor a almacenar
        //Con este for ya no se tiene acceso a un contador o indice 
        //por lo que si se necesita ese valor es mejor usar for no forEach
        for(int edad: edades){
            
            System.out.println("edad = " + edad);
            
        }
        
        Persona personas[] = {new Persona("Sebastian"),new Persona("Marly"),new Persona("Barby"),new Persona("Azu"),new Persona("Jose"),new Persona("Debi"),new Persona("Ale"),new Persona("Lolo"),new Persona("Alma"),new Persona("Miriam")};
        
        for(Persona persona: personas){
            
            System.out.println("persona = " + persona);
            
        }
        
        
    }
}
