package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        int resultado;
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado con retorno = " + resultado);
        
        
    }
}
