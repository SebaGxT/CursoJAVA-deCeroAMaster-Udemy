package test;

/*

Esto tiene que ver con los tipo primitivos, cada uno de estos tiene una clase en JAVA 
asociada conocida como Clase Wrapper o Clase envolvente

Clases Envolventes de tipos primitivos

                    Tipo  Clase

                    int - Integer
                    long - Long
                    float - Float
                    double - Double
                    boolean - Boolean
                    byte - Byte
                    char - Character
                    short - Short

Los tipos primitivos solamente almacenan un valor

Estas clases Envolventes contienen atributos y metodos

*/

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        
        //Valor asignado a tipo primitivo
        int entero = 10;
        //Valor asignado a clase envolvente - crea un tipo object - Autoboxing
        Integer entero1 = 10;
        //Imprime una literal entera con la que se pueden realizar calculos
        System.out.println("entero1 = " + entero1);
        //Imprime una litera de tipo String que permite concatenar
        System.out.println("entero1 = " + entero1.toString());
        //Permite realizar la conversion de valor mas facilmente, mandando a llamar el metodo
        System.out.println("entero1 Double = " + entero1.doubleValue());
        System.out.println("entero1 Float = " + entero1.floatValue());
        System.out.println("entero1 Long = " + entero1.longValue());
        System.out.println("entero1 Byte = " + entero1.byteValue());
        
        //Se conoce el proceso de extraccion como unboxing porque extrae el valor de tipo object de las clases envolventes
        //Permitiendolo almacenar en una variable tipo primitivo - Unboxing
        int entero2 = entero1;
        System.out.println("entero2 = " + entero2);
        
    }
}
