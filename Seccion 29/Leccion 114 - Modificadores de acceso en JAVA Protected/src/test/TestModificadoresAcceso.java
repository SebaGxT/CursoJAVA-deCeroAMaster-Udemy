package test;

import paquete1.Clase1;
import paquete2.Clase2;

public class TestModificadoresAcceso {
    
    public static void main(String[] args) {
        
        Clase1 clase1 = new Clase1("Publico");
        
        System.out.println("clase1 = " + clase1);
        
        Clase2 clase2 = new Clase2();
        System.out.println("clase2 = " + clase2);
        
    }
    
}
