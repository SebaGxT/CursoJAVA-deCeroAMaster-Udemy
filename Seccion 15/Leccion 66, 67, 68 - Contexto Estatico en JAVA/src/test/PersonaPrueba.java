package test;

import domain.Persona;

public class PersonaPrueba {
    
    private int contador;
    
    public static void main(String[] args) {

        Persona persona1 = new Persona("Sebastian");
        Persona persona2 = new Persona("Marly");
        
        //Si se llama a otro metodo dentro de un metodo estatico ese tambien debe ser estatico, si no genera error
        imprimir(persona1);
        imprimir(persona2);
        
        //No se puede utilizar la palabra reservada this dentro de un metodo estatico
        //Tampoco se pueden utilizar variables que no sean estaticas dentro de un metodo estatico
        //this.contador = 10; error
        
    }
    
    /*El orden de los modificadores public y static no importan puede ser static public o public static 
    y no alteran el programa
    
    */
    public static void imprimir(Persona persona) {

        System.out.println("Persona: " + persona);

    }
    
    public int getContador(){
        
        //No genera error porque se encuentran en un contexto dinamico y estos si pueden acceder a un contexto estatico
        //En el caso de la llamada a metodo imprimir
        imprimir(new Persona("Barby"));
        
        //Permite utilizar this porque esta en un contexto dinamico
        return this.contador;
        
    }
}
