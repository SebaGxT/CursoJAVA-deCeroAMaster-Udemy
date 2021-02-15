
package operaciones;

public class Operaciones {
    
    //La sobrecarga de metodos es definir 2 o mas veces el metodo a utilizar pero poniendo el mismo nombre
    //Estos metodos van a realizar lo mismo utilizando diferentes argumentos
    
    public static int sumar(int a,int b){
        
        System.out.println("Suma enteros");
        return a + b;
        
    }
    
    public static double sumar(double a, double b){
        
        System.out.println("Suma double");
        return a + b;
        
    }
    
}
