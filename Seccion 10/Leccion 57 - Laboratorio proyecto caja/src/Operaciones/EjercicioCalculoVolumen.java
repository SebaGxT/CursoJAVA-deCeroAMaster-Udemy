package Operaciones;

import java.util.Scanner;

public class EjercicioCalculoVolumen {

    public static void main(String[] args) {

        int alto, ancho, profundo, volumen;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el alto de la caja: ");
        alto = scanner.nextInt();
        System.out.println("Ingrese el ancho de la caja: ");
        ancho = scanner.nextInt();
        System.out.println("Ingrese la profundidad de la caja: ");
        profundo = scanner.nextInt();

        Caja caja1 = new Caja();
        caja1.alto = alto;
        caja1.ancho = ancho;
        caja1.profundo = profundo;
        volumen = caja1.calcularVolumen();
        System.out.println("Volumen de la caja = " + volumen);

        Caja caja2 = new Caja(5, 6, 7);
        volumen = caja2.calcularVolumen();
        System.out.println("Volumen de la caja 2 = " + volumen);

    }

}
