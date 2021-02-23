/*
El modificador default o package es la ausencia del mismo
Las clases, atributos o metodos default o package solo pueden ser utilizados dentro del mismo paquete

Modificador     Clase       Variable        Metodo      Constructor

public           si             si             si           si
protected        no             si             si           si
default*         si             si             si           si   default o package
private          no             si             si           si



 */
package paquete1;

class Clase1 {

    String atributoDefault = "Valor atributo default";

    Clase1() {

        System.out.println("Constructor default");

    }

    void metodoDefault() {

        System.out.println("Metodo default");

    }

}
