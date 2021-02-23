/*

En este ejemplo se utiliza polimorfismo en un metodo que dependiendo del objeto que reciba utiliza su
metodo obtenerDetalles, se define como argumento a recibir en la definicion del metodo el objeto mas generico
la clase padre, al recibir el objeto como parametro determina si es de la clase padre o hija y
ejecuta el metodo de su clase

para esto es necesario implementar herencia y tener metodos sobreescritos de la clase padre.

El objetivo es crear metodos genericos que permitan trabajar con datos de distintas clases y no crear metodos duplicados
o que realizen lo mismo.

El metodo del hijo no puede ser mas restrictivo al metodo que sobre escribe. Si el metodo padre es de tipo protected
el metodo del hijo no puede ser private pero si puede ser menos restrictivo podria ser public



*/
package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreEscritura {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Sebastian", 25000);
        Gerente gerente = new Gerente("Sebastian", 42000, "TI");

        Imprimir(empleado);
        Imprimir(gerente);
        
        //una variable de la clase padre puede almacenar referencias de memoria de las clases hijas
        empleado = new Gerente("Marly",42000,"Administracion");
        Imprimir(empleado);

    }

    public static void Imprimir(Empleado empleado) {

        System.out.println("empleado = " + empleado.obtenerDetalles());

    }

}
