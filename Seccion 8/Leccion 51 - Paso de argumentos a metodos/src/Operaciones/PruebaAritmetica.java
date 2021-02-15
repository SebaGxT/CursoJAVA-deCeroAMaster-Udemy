package Operaciones;

import java.util.Scanner;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n1,n2,resultado;
        
        System.out.println("Ingrese el numero 1:");
        n1 = scanner.nextInt();
        System.out.println("Ingrese el numero 2:");
        n2 = scanner.nextInt();
        
        Aritmetica aritmetica1 = new Aritmetica();
        resultado = aritmetica1.sumaParametros(n1, n2);
        
        System.out.println("resultado usando parametros: " + resultado);
        
    }
}
