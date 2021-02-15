package test;

public class TestArgumentosVariables {

    public static void main(String[] args) {

        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Sebastian",10,11,12);

    }

    //Se define el tipo de dato y se agrega tres puntos para indicar que se va a trabajar con argumentos variables 
    //y luego el nombre. a diferecian de pasar argumentos variables con arreglos es que para arreglos ya se debe
    //saber que cantidad va a pasarse al metodo
    private static void imprimirNumeros(int... numeros) {

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Elemento: " + numeros[i]);

        }

    }
    
    //Si se tienen varios argumentos para la definicion de un metodo
    //El argumento variable siempre debe ser el ultimo en definirse
    private static void variosParametros(String nombre, int... numeros) {

        System.out.println("Nombre: " + nombre);

        imprimirNumeros(numeros);

    }

}
