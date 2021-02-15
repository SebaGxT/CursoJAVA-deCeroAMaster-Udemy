package Operaciones;

public class Aritmetica {
    
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica(){
        
        System.out.println("Ejecutando constructor vacio");
        
    }
    
    //Constructor con carga
    public Aritmetica(int a, int b){
        
        System.out.println("Ejecutando constructor con carga");
        this.a = a;
        this.b = b;
        
    }
    
    //Metodos de la clase
    public void suma(){
        
        int resultado = a + b;
        System.out.println("resultado: " + resultado);
        
    }
    public int sumarConRetorno(){
        
        return this.a + this.b;
        
    }
    
    public int sumarParametros(int a, int b){
        
        this.a = a;
        this.b = b;
        
        return this.sumarConRetorno();
        
    }
    
}
