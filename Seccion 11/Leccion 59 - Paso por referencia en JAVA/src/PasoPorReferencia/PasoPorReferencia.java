package PasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.nombre = "Marly";
        persona1.apellido = "Donzelli";
        persona1.desplegarInformacion();
        cambiarValor(persona1);
        persona1.desplegarInformacion();

    }

    public static void cambiarValor(Persona persona) {

        persona.nombre = "Sebastian";
        persona.apellido = "De la Vega";

    }

}
