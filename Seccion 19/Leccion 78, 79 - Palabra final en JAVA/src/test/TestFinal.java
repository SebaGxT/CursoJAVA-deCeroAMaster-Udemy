package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {

        final int n1 = 10;

        System.out.println("n1 = " + n1);

        //No se puede modificar el valor a una variable marcada como final
        //n1 = 11;
//        Persona.MI_CONSTANTE = 5;
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);

        final Persona persona1 = new Persona();
        //No permite asignar una nueva referencia al objeto creado y marcado como final
//        persona1 = new Persona();
        //Lo que si permite es modificar el valor dentro del objeto
        persona1.setNombre("Sebastian");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Marly");
        System.out.println("persona1 = " + persona1.getNombre());

    }
}
