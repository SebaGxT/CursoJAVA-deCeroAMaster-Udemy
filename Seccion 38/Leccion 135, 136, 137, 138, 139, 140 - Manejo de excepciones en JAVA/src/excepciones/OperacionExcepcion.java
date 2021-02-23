package excepciones;

//public class OperacionExcepcion extends Exception {
//
//    public OperacionExcepcion(String msj) {
//
//        super(msj);
//
//    }
//
//}

/*

En caso de utilizar RuntimeException la declaracion de los metodos  que usen la excepcion no van a tener que 
declarar throws OperacionExcepcion en su definicion y el uso de la excepcion no requiere de un bloque try y catch

 */
public class OperacionExcepcion extends RuntimeException {

    public OperacionExcepcion(String msj) {

        super(msj);

    }

}
