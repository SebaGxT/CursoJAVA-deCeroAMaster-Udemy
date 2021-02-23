/*

Las tecnologias avanzadas siempre hacen uso del constructor vacio ya que por lo general no se sabe cuantos argumentos
hacen falta para crear un objeto

 */
package test;

import domain.Persona;

public class TestJavaBeans {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Sebastian");
        persona.setApellido("De la Vega");

        System.out.println("persona = " + persona);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());

    }
}
