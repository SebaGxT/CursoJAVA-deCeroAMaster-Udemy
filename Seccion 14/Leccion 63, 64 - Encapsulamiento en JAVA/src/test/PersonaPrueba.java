package test; //La sentencia package es solo para la clase que se esta utilizando

import dominio.Persona; //Para agregar una clase fuera del paquete se utiliza import paquete.clase;
//Para importar todas las clases de un paquete se utiliza import paquete.*;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Sebastian", "De la Vega", 42000, false);
        persona1.setNombre("Marly");
        persona1.setApellido("Donzelli");
        persona1.setSueldo(40000.00);
        persona1.setEliminado(false);
        /*
        persona1.nombre = "Sebastian"; esta sentencia marca error ya que el modificador del atributo 
        es privado por lo que no puede ser modificada
        
        System.out.println("Nombre: "+persona1.nombre); esta sentencia marca error 
        ya que el modificador del atributo es privado por lo que no puede mostrarse por consola
        
         */

        Persona persona2 = new Persona();
        persona2.setNombre("Sebastian");
        persona2.setApellido("De la Vega");
        persona2.setSueldo(42000.00);
        persona2.setEliminado(false);

        if (persona1.isEliminado() == false) {

            System.out.println("Nombre: " + persona1.getNombre());
            System.out.println("Apellido: " + persona1.getApellido());
            System.out.println("Sueldo: " + persona1.getSueldo());

        } else {

            System.out.println("Persona no encontrada");

        }
        
        persona2.setEliminado(true);
        
        if (persona2.isEliminado() == false) {

            System.out.println("Nombre 2: " + persona2.getNombre());
            System.out.println("Apellido 2: " + persona2.getApellido());
            System.out.println("Sueldo 2: " + persona2.getSueldo());

        } else {
            
            System.out.println("Persona no encontrada");
            
        }

    }
}
