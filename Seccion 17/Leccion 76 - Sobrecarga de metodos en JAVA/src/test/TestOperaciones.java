package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {

        var resultado = Operaciones.sumar(5, 3);

        System.out.println("resultado = " + resultado);
        
        //Para llamar al metodo de suma con double tiene que tener al menos un numero double 2D o 2.0
        
        var resultado2 = Operaciones.sumar(2.0, 3);

        System.out.println("resultado = " + resultado);
        
        //Se aplica inferencias de tipo y toma el metodo que cumpla con todos los parametros para ser ejecutado
        var resultado3 = Operaciones.sumar(3,5L);
        System.out.println("resultado3 = " + resultado3);

    }
}
