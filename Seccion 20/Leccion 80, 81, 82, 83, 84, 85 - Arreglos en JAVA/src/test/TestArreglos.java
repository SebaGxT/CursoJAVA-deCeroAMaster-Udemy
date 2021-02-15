//Existen arreglos para elementos primitivos como int double String, etc 
//y para elementos de tipo object como el de persona con el que se viene trabajando hasta ahora.
package test;

public class TestArreglos {

    public static void main(String[] args) {

        //Los corchetes pueden ir antes del nombre de la variable o despues indistintamente []edades o edades[]
        //Los arreglos en JAVA son de tipo object por lo que hay que instanciarlos para crear un arreglo
        //Se coloca el tipo - nombre de variable con [] - igual - new tipo [cantidad];
        //Una vez declarado el arreglo no puede crecer por lo que se establece con los limites de espacios declarado
        //Los arreglos no pueden crecer dinamicamente
        int edades[] = new int[3];
        //Se puede observar en que zona de memoria esta alojado el objeto
        System.out.println("edades = " + edades);

        edades[0] = 10;
        edades[1] = 5;
        edades[2] = 3;

        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]);
        System.out.println("edades 2 = " + edades[2]);

        //Muestra error de excepcion indicando que esta fuera del limite del arreglo
        //es un error en tiempo de ejecucion
        //edades[3] = 5;
        for (int i = 0; i < edades.length; i++) {

            System.out.println("edades " + i + " = " + edades[i]);

        }

        //Sintaxis resumida en la creacion de un arreglo
        String nombres[] = { "Sebastian", "Marly", "Barby" };
        
        for (int i = 0; i < nombres.length; i++) {
            
            System.out.println("nombres = " + nombres[i]);
            
        }
        
    }
}
