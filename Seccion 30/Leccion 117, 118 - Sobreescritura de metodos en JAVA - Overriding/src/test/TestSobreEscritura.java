package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreEscritura {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan", 25000);
        Gerente gerente1 = new Gerente("Sebastian", 45000, "TI");

        System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());

    }
}
