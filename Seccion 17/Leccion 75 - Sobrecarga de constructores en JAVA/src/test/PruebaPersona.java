package test;

import domain.Persona;
import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class PruebaPersona {

    public static void main(String[] args) {

        var fecha = new Date();

        Persona persona1 = new Persona("Sebastian", 'M', 26, "Bartolome mitre");
        Persona persona2 = new Persona("Marly", 'F', 20, "Bartolome mitre");
        Empleado empleado1 = new Empleado("Sebastian", 'M', 26, "Bartolome mitre", 42000.0);
        Empleado empleado2 = new Empleado("Marly", 'F', 20, "Bartolome mitre", 42000.0);
        Empleado empleado3 = new Empleado("Barby", 'F', 32, "Bartolome mitre", 42000.0);
        Empleado empleado4 = new Empleado("Deby", 'F', 28, "Av.Corrientes", 42000.0);
        Cliente cliente1 = new Cliente("Barby", 'F', 32, "Bartolome mitre", true);
        Cliente cliente2 = new Cliente("Debi", 'F', 28, "Av.Corriente", true);

        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        System.out.println("empleado1 = " + empleado1);
        System.out.println("empleado2 = " + empleado2);
        System.out.println("empleado3 = " + empleado3);
        System.out.println("empleado4 = " + empleado4);
        System.out.println("cliente1 = " + cliente1);
        System.out.println("cliente2 = " + cliente2);

    }

}
