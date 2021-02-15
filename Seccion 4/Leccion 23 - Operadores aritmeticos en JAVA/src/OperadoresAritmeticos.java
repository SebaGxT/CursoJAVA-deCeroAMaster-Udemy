
public class OperadoresAritmeticos {
    public static void main(String args[]){
        
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado de la resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado de la multiplicacion = " + resultado);
        
        var resultado2 = 3D / b;
        System.out.println("resultado de la division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado del modulo = " + resultado);
        
        if(a % 2 == 0){
            
            System.out.println("El numero es par");
            
        }else{
            
            System.out.println("El numero es impar");
            
        }
        
    }
}
