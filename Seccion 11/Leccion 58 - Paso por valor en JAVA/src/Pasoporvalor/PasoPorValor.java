package Pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        
        int x = 10;
        System.out.println("x = " + x);
        
        /*Solo transmite una copia del valor en la variable no se puede modificar 
        su valor fuera del metodo donde fue creada la variable - Esto se llama paso por valor */
        cambioValor(x);
        
        //No fue modificada a pesar de modificar el valor de la variable arg1 en el metodo cambioValor
        System.out.println("x Nuevo valor = " + x);
        
    }
    
    //El paso por valor aplica a tipos primitivos como int, long, double, etc
    public static void cambioValor(int arg1){
        
        System.out.println("arg1 = " + arg1);
        
        arg1 = 15;
        
        
    }
    
}
