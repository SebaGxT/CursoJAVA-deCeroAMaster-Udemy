
package test;

import genericos.ClaseGenerica;


public class TestGenerics {
    
    public static void main(String[] args) {
        
        //Debe coincidir el tipo indicado con el tipo proporcionado Integer - 15
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        
        objetoInt.ObtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Sebastian");
        
        objetoString.ObtenerTipo();
        
    }
    
}
