package mundopc;

import java.util.Scanner;
import ar.com.mundopc.Orden;
import ar.com.mundopc.Computadora;
import ar.com.mundopc.Monitor;
import ar.com.mundopc.Raton;
import ar.com.mundopc.Teclado;

public class MundoPC {

    public static void main(String[] args) {

        Orden orden1 = new Orden();
        for (int i = 0; i < Orden.MAX_COMPUTADORAS; i++) {

            Computadora computadora = new Computadora(null,null,null,null);
            CargarComputadora(computadora);
            orden1.agregarComputadora(computadora);

        }
        orden1.mostrarOrden();

    }

    public static void CargarComputadora(Computadora computadora) {

        Scanner scanner = new Scanner(System.in);
        String nombre;
        String marca;
        String tipoEntrada;
        double tamanio;

        System.out.println("Ingrese nombre de la computadora: ");
        nombre = scanner.nextLine();
        computadora.setNombre(nombre);
        System.out.println("Ingrese marca del monitor: ");
        marca = scanner.nextLine();
        System.out.println("Ingrese tamanio del monitor: ");
        tamanio = Double.parseDouble(scanner.nextLine());
        Monitor monitor = new Monitor(marca, tamanio);
        computadora.setMonitor(monitor);
        System.out.println("Ingrese tipo de entrada raton: ");
        tipoEntrada = scanner.nextLine();
        System.out.println("Ingrese marca del raton: ");
        marca = scanner.nextLine();
        Raton raton = new Raton(tipoEntrada, marca);
        computadora.setRaton(raton);
        System.out.println("Ingrese tipo de entrada teclado: ");
        tipoEntrada = scanner.nextLine();
        System.out.println("Ingrese marca del teclado: ");
        marca = scanner.nextLine();
        Teclado teclado = new Teclado(tipoEntrada, marca);
        computadora.setTeclado(teclado);

    }

}
