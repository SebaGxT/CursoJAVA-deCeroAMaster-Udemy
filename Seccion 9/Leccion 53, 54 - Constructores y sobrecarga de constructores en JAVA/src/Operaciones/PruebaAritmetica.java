
package Operaciones;

import java.util.Scanner;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        int n1,n2,resultado;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1:");
        n1 = scanner.nextInt();
        System.out.println("Ingrese el numero 2:");
        n2 = scanner.nextInt();
        
        //Constructor vacio
        Aritmetica aritmetica1 = new Aritmetica();
        resultado = aritmetica1.sumarParametros(n1, n2);
        System.out.println("resultado con parametros: " + resultado);
        
        //Constructor con carga
        Aritmetica aritmetica2 = new Aritmetica(10,20);
        System.out.println("a: "+aritmetica2.a);
        System.out.println("b: "+aritmetica2.b);
        aritmetica2.suma();
        
        
    }
}
