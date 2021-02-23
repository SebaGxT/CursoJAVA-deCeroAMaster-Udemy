/*

en la definicion del metodo se debe aclarar que el metodo podria arrojar una excepcion --> throws nombre de excepcion
throw significa arrojar, es necesario para crear una excepcion

 */
package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {

    public static int division(int numerador, int denominador) throws OperacionExcepcion {

        if (denominador == 0) {

            throw new OperacionExcepcion("Division entre cero");

        }

        return numerador / denominador;

    }
//    public static int division(int numerador, int denominador) {
//
//        if (denominador == 0) {
//
//            throw new OperacionExcepcion("Division entre cero");
//
//        }
//
//        return numerador / denominador;
//
//    }

}
