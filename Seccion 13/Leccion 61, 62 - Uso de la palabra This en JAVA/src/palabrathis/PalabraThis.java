package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {

        /*Persona persona1 = new Persona (new String("Sebastian"),new String("De la Vega")) 
        este metodo es valido pero poco comun, este metodo permite alojar el objeto en una posicion de memoria
        unica, el metodo comun Persona persona1 = new Persona("Sebastian","De la Vega") aloja los objetos creados
        en una zona de memoria llamada pull String que es un conjunto de cadena que va a hacer administrada por JAVA
        Esto permite a JAVA reutilizar el objeto ya creado siempre que respete los mismos caracteres tanto minusculas
        como mayusculas para un uso mas eficiente de la memoria*/
        Persona persona1 = new Persona("Sebastian", "De la Vega");
        System.out.println("persona1 = " + persona1);
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Apellido: " + persona1.apellido);

    }
}

/*Solamente puede haber una clase publica en cada archivo y paquete, 
el resto de las clases ya no se les agrega el modificador public ya que solo van a ser utilizadas en el archivo y paquete*/

 /*Si no se especifica public su modificador de acceso es default o package, default class o package class, 
no se va a ver escrito de esa manera


Esta clase Persona no se puede utilizar en otro paquete ya que fue definido aca y no cuenta con el modificador public
 */
class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {

        /*Constructor de la clase padre es un constructor vacio no se pasa argumentos, 
        es el constructor de la clase object y es el encargado de reservar el espacio en memoria
         */
        //super(); aunque no se vea esta llamada siempre se ejecuta
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando This: " + this);
        //Ya que se esta dentro del objeto tipo persona se puede utilizar this para pasar el objeto como parametro
        //Se puede utilizar esta sintaxis para ahorra la creacion de una variable Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);

    }

}

class Imprimir {

    public void imprimir(Persona persona) {

        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual(this): " + this);
        System.out.println("Nombre desde imprimir: "+persona.nombre);
        System.out.println("Apellido desde imprimir: "+persona.apellido);

    }

}
