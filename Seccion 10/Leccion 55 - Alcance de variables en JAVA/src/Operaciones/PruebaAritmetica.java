package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        /*Variables locales -  var solo puede utilizarse cuando se trabaja con variables locales, 
        no puede usarse por ejemplo en atributos de clases de objetos, tampoco esta permitido como argumento de metodos
        La variables solo pueden utilizarse en el metodo donde se definen
        */
        var a = 10;
        var b = 2;
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 A = " + aritmetica1.a);
        System.out.println("aritmetica1 B = " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 A = " + aritmetica2.a);
        System.out.println("aritmetica2 B = " + aritmetica2.b);
        
    }
    
    public static void miMetodo(){
        //Variable a esta fuera del alcance donde fue definida
        //a = 10;
        System.out.println("Otro metodo");
        
    }
    
}
