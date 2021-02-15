package Operaciones;

public class Aritmetica {
    
    //Atributos de la clase
    int a;
    int b;
    
    //Metodos de la clase
    public void sumar(){
        
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        
    }
    
    public int sumarConRetorno(){
        
        int resultado = a + b;
        return resultado;
        
        //return (a + b);
        
    }
    
}
