package test;

import domain.Persona;
import java.util.Scanner;

public class TestMatrices {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 9;
        edades[2][1] = 3;

        System.out.println("edades 0 0 = " + edades[0][0]);
        System.out.println("edades 0 1 = " + edades[0][1]);
        System.out.println("edades 1 0 = " + edades[1][0]);
        System.out.println("edades 1 1 = " + edades[1][1]);
        System.out.println("edades 2 0 = " + edades[2][0]);
        System.out.println("edades 2 1 = " + edades[2][1]);

        for (int f = 0; f < edades.length; f++) {

            //Para regresar la cantidad de columnas se especifica matriz[cantidad de filas].length
            for (int c = 0; c < edades[f].length; c++) {

                edades[f][c] = c;

            }

        }

        for (int f = 0; f < edades.length; f++) {

            for (int c = 0; c < edades.length - 1; c++) {

                System.out.println("Edades " + f + " " + c + " = " + edades[f][c]);

            }

        }

        //sintaxis simplificada con matrices
        //La declaracion debe estar entre llaves y dentro cada fila se declara entre llaves
        //cada fila se separa con coma y dentro de cada fila la cantidad de elementos determina la cantidad de columnas
        // los elementos se separan con coma
        String frutas[][] = {{"banana", "manzana", "naranja"}, {"pera", "kiwi", "melon"}, {"zandia", "uva", "durazno"}};

        imprimirMO(frutas);

        for (int f = 0; f < frutas.length; f++) {

            for (int c = 0; c < frutas[f].length; c++) {

                System.out.println("Frutas " + f + " " + c + " = " + frutas[f][c]);

            }

        }

        Persona personas[][] = new Persona[3][2];
        System.out.println("personas = " + personas);

        personas[0][0] = new Persona("Sebastian", "De la Vega");
        System.out.println("Nombre y apellido: " + personas[0][0].getNombre() + " " + personas[0][0].getApellido());
        personas[0][1] = new Persona();
        personas[0][1].setNombre("Marly");
        personas[0][1].setApellido("Donzelli");
        System.out.println("Nombre y apellido: " + personas[0][1].getNombre() + " " + personas[0][1].getApellido());

        imprimirMO(personas);

        for (int f = 0; f < personas.length; f++) {

            for (int c = 0; c < personas[f].length; c++) {

                String n;
                personas[f][c] = new Persona();
                System.out.println("Ingrese nombre: ");
                n = scanner.nextLine();
                personas[f][c].setNombre(n);
                System.out.println("Ingrese apellido: ");
                n = scanner.nextLine();
                personas[f][c].setApellido(n);

            }

        }

        for (int f = 0; f < personas.length; f++) {

            for (int c = 0; c < personas[f].length; c++) {

                System.out.println("Nombre y apellido: " + personas[f][c].getNombre() + " " + personas[f][c].getApellido());
                System.out.println("personas = " + personas[f][c]);

            }

        }

    }

    public static void imprimirMO(Object matriz[][]) {

        for (int f = 0; f < matriz.length; f++) {

            for (int c = 0; c < matriz[f].length; c++) {

                System.out.println("Matriz " + f + " " + c + " = " + matriz[f][c]);

            }

        }

    }

}
