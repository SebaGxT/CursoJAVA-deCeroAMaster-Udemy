/*

El manejo de excepciones permite que la ejecucion del programa no termine abruptamente y pueda continuar
dentro del bloque try es el intento de ejecucion del codigo que podria fallar 
y el catch se le declara una variable que guarda la excepcion y esta se puede imprimir por consola
esta excepcion se guarda en la pila de excepciones o stack, se utiliza una pila ya que una excepcion podria 
descencadenar una cadena de excepciones que provocan otras excepciones

La clase padre que se utiliza es la de Exception esta tiene una clase padre pero no se utiliza directamente
desde Exception se crean las clases de excepciones

Las clases que heredan de la clase Excepcion se conocen como checkException estas el compilador
obliga a agregar un bloque de try y catch o si no a propagar la excepcion

Las clases que heredan de RuntimeException se conocen como uncheckException el compilador no obliga a agregar un
try y catch o a reportar una excepcion, tampoco va a marcar un error ya que va a mostrarse en tiempo de ejecucion

NullPointerException cualquier variable que quiera acceder a un atributo o metodo y no este apuntando a un objeto
valido y tenga asignado el valor de null va a marcar un error de excepcion de tipo NullPonterException

 */
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {

        //Metodo sin una clase de excepcion personalizada
//        int resultado = 0;
//
//        try {
//
//            resultado = 10 / 0;
//
//        } catch (Exception e) {
//
//            e.printStackTrace(System.out);
//
//        }
//
//        System.out.println("resultado = " + resultado);
/*

Metodo con una clase de excepcion personalizada extends Exception

Se pueden ejecutar 1 o mas excepciones agregando bloque catch - siempre se recomienda ejecutar primero las excepciones
de menor jerarquia

         */
        int resultado = 0;
        try {

            resultado = division(10, 0);

        } catch (OperacionExcepcion e) {

            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Ocurrio un error de tipo Exception:");
            //e.printStackTrace(System.out);
            //Obtiene el mensaje para imprimirlo sin el codigo de excepcion
            System.out.println(e.getMessage());

        } //Este codigo de finally siempre se va a ejecutar independientemente de si se ejecuto o no una excepcion
        //Este bloque se puede utilizar para cerrar cualquier recurso como una conexion a base de datos o un archivo
        finally {

            System.out.println("Se reviso la division entre cero");

        }

        /*
Metodo con una clase de excepcion personalizada extends RuntimeException

con este metodo el programa termina abruptamente y no te obliga a manejar la excepcion pero permite personalizar el
mensaje de salida que muestra el codigo de excepcion

Exception in thread "main" excepciones.OperacionExcepcion: Division entre cero <-- mensaje personalizado
	at aritmetica.Aritmetica.division(Aritmetica.java:28)
	at test.TestExcepciones.main(TestExcepciones.java:63)
C:\Users\gueri\AppData\Local\NetBeans\Cache\12.2\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\gueri\AppData\Local\NetBeans\Cache\12.2\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)


Se recomienda usar RuntimeException donde no se esta seguro que arroje un error exception
y exception donde realmente se lo requiera para dejar mas limpio el codigo

         */
//        int resultado = 0;
//
//        resultado = division(10, 0);
//        
//        System.out.println("resultado = " + resultado);
    }

}
