/*

Se puede ingresar una ruta con el nombre del archivo

en windows c:\\nombrecarpeta\nombrearchivo.extension
en linux y mac /nombrecarpeta/nombrearchivo.extension

en caso de no indicar ruta se crea en el proyecto

 */
package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;
import static manejoarchivos.ManejoArchivos.escribirArchivo;
import static manejoarchivos.ManejoArchivos.sobreEscribirArchivo;
import static manejoarchivos.ManejoArchivos.leerArchivo;

public class TestManejoArchivo {

    public static void main(String[] args) {

        //Crear una variable para recibir el nombre del archivo
        var nombreArchivo = "Wow.txt";

        //crearArchivo(nombreArchivo);
        //escribirArchivo(nombreArchivo, "Monje");
        //leerArchivo(nombreArchivo);

    }

}
