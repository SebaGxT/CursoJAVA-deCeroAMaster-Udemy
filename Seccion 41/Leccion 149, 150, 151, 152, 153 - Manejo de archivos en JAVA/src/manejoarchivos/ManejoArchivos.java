/*

El manejo de archivo implica varias operaciones desde:

- Crear el archivo
- Guardar informacion en el archivo
- Eliminar informacion
- Eliminar el archivo
- Y otras

Estos metodos son estaticos para poder utilizarlos directamente sin tener que crear objetos de esta clase

java.io paquete io significa input/output

 */
package manejoarchivos;

import java.io.*;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {

        //Esto crea un objeto de tipo File en memoria
        File archivo = new File(nombreArchivo);

        //PrintWriter solicita agregar un bloque try y catch para indicar que puede haber errores ya que hereda de la
        //Clase Exception y es del tipo check
        try {

            //Abriendo el archivo en memoria
            PrintWriter salida = new PrintWriter(archivo);
            //Cierra y crea el archivo en disco duro
            salida.close();
            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {

            //FileWriter lleva dos parametros el archivo y un true para anexar informacion o false para sobreescribir
            //Este tambien puede arrojar una excepcion por lo que hace falta agregar un catch al bloque
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el archivo");

        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

        } catch (IOException ex) {

            ex.printStackTrace(System.out);

        }

    }

    //Argumentos el primero para la ruta del archivo y el segundo para el contenido a incorporar en el archivo
    public static void sobreEscribirArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {

            //Abre el archivo
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha sobreescrito el archivo");

        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

        }

    }

    public static void leerArchivo(String nombreArchivo) {

        //Tambien puede ser var archivo ya que tiene inferencia de tipo
        File archivo = new File(nombreArchivo);

        try {
            //Al utilizar buffer se pueden leer lineas completas del archivo ya que permite almacenar caracter a caracter
            //Permite utilizar var
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));

            var lectura = entrada.readLine();
            int i = 0;
            while (lectura != null) {

                System.out.println("Linea " + i + ": " + lectura);
                lectura = entrada.readLine();
                i++;

            }

            entrada.close();

        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

        } catch (IOException ex) {

            ex.printStackTrace(System.out);

        }

    }

}
