
import java.util.Scanner;

public class ScannerJava {
    public static void main(String args[]){
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre:");
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Ingrese su titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}
