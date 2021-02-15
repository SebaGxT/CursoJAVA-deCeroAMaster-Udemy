package Operaciones;

//Variable this apunta al objeto en ejecucion

import java.util.Scanner;

public class PruebaAritmetica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aritmetica aritmetica1 = new Aritmetica();
        
        int n1, n2, resultado;
        
        System.out.println("Ingrese el numero 1:");
        n1 = scanner.nextInt();
        System.out.println("Ingrese el numero 2:");
        n2 = scanner.nextInt();
        
        resultado = aritmetica1.sumaParametros(n1, n2);
        System.out.println("resultado con parametros: " + resultado);
        
        
    }
}
