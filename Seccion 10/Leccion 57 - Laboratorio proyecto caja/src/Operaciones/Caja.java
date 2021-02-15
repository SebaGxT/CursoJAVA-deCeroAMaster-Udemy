package Operaciones;

public class Caja {

    //Atributos de la clase
    int alto, ancho, profundo;

    //Construtores
    public Caja() {

        System.out.println("Constructor Objeto vacio");

    }

    public Caja(int alto, int ancho, int profundo) {

        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;

        System.out.println("Constructos Objeto con parametros");

    }

    //Motodos de la clase
    public int calcularVolumen() {

        int volumen;

        volumen = this.alto * this.ancho * this.profundo;

        return volumen;

    }

}
