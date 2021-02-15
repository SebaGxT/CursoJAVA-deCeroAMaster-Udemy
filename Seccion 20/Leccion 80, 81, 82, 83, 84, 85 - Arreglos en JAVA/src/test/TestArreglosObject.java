package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        
        //Se crea el arreglo de tipo persona con el limite maximo de espacios para el arreglo
        Persona personas[] = new Persona[2];
        
        //Cuando el arreglo se crea los indices empiezan en NULL y es necesario crear objetos para utilizar el espacio
        //Se crean objetos de tipo persona dentro del arreglo en cada posicion
        personas[0] = new Persona("Sebastian", "De la Vega");
        personas[1] = new Persona();

        personas[1].setNombre("Marly");
        personas[1].setApellido("Donzelli");

        System.out.println("persona 0 = " + personas[0].getNombre() + " " + personas[0].getApellido());
        System.out.println("persona 1 = " + personas[1].getNombre() + " " + personas[1].getApellido());

        for (int i = 0; i < personas.length; i++) {

            System.out.println("persona " + i + " = " + personas[i].getNombre() + " " + personas[i].getApellido());

        }

    }
}
