package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setNombre("Sebastian");
        persona1.setApellido("De la Vega");
        persona1.setSueldo(42000.00);
        persona1.setEliminado(true);
        persona2.setNombre("Marlene");
        persona2.setApellido("Donzelli");
        persona2.setSueldo(42000.00);
        persona2.setEliminado(true);

        if (persona1.isEliminado() == false) {

            System.out.println("Nombre 1: " + persona1.getNombre());
            System.out.println("Apellido 1: " + persona1.getApellido());
            System.out.println("Sueldo 1: " + persona1.getSueldo());

        } else {

            System.out.println("Persona no encontrada");

        }

        if (persona2.isEliminado() == false) {

            System.out.println("Nombre 2: " + persona2.getNombre());
            System.out.println("Apellido 2: " + persona2.getApellido());
            System.out.println("Sueldo 2: " + persona2.getSueldo());

        } else {

            System.out.println("Persona no encontrada");

        }
        
        //print o println pueden llamar de manera automatica el metodo toString si se encuentra definido dentro de la clase
        System.out.println("Persona 1: "+persona1);
        System.out.println("Persona 2: "+persona2.toString());

    }

}
