/*

Es como un tipo comodin en el cual cuando se define la clase no indica que tipo de dato que va a almacenar  o utilizar
la clase, sino que al momento en el que se va a utilizar se especifica el dato, a esto se lo conoce como tipo generico

Nombre Tipo Generico    Significado del Tipo Generico

E                       Element(utilizado generalmente por el framework de Colecciones de java)

K                       Key(Llave, utilizado en mapas)

N                       Number(utilizado para numeros)

T                       Type(Representa un tipo, es decir una clase)

V                       Value(Representa un valor, tambien se usa en mapas )

S,U,V etc.              Usado para representar otros tipos

 */
package genericos;

public class ClaseGenerica<T> {
    
    //Atributo generico
    T objeto;
    
    //Constructor
    public ClaseGenerica(T objeto) {

        this.objeto = objeto;

    }
    
    //Metodo
    public void ObtenerTipo() {
        
        //Imprime el tipo de objeto ingresado
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());

    }

}
