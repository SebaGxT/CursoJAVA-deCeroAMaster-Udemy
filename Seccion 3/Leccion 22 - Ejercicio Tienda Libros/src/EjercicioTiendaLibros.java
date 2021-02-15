import java.util.Scanner;

public class EjercicioTiendaLibros {
    public static void main(String args[]){
        
        var consola = new Scanner(System.in);
 
        var envioGratis = true;
        
        System.out.println("Ingrese el nombre:");
        var nombre = consola.nextLine();
        System.out.println("Ingrese el ID:");
        var id = Integer.parseInt(consola.nextLine());
        System.out.println("Precio:");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println(nombre + " " + '\u0023' + id);
        System.out.println("Precio: " + '\u0024' + precio);
        System.out.println("Proporciona el envio gratuito: " + envioGratis);
        
    }
}
