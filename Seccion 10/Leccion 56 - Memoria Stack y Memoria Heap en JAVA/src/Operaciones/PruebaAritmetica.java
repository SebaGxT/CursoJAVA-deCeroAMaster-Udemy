package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        //Variables locales se almacenan en la memoria Stack
        var a = 10;
        var b = 2;
        
        /*Variables tipo Object se almacenan en la Memoria Heap
        En caso de trabajar con aplicaciones mas grandes en el cual el tiempo de vida tiene mayor duracion
        Los objetos permanecen en memoria
        */
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 A = " + aritmetica1.a);
        System.out.println("aritmetica1 B = " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 A = " + aritmetica2.a);
        System.out.println("aritmetica2 B = " + aritmetica2.b);
        
        /*System.gc() - (Garbage Collector) Programa el recolector de basura para que cuando sea posible se ejecute
         y pueda eliminar todos los  objetos que ya estan siendo utilizados por el programa, todos los objetos que ya
        no estan siendo refereciados por ninguna variable y se puedan eliminar de la memoria
        */
        
        //Ejemplo de un objeto que ya no es referenciado por ninguna variable
        //aritmetica1 = null;
        /*Hacer el llamado al recolector no garantiza que se ejecute, solamente lo programa para que se ejecute cuando
        sea posible */
        //System.gc();
        
    }
    
}
