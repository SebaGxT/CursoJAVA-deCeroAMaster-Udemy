
import java.util.Scanner;

public class MayorDeDos {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Ingrese el primer numero:");
        numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el segundo numero:");
        numero2 = Integer.parseInt(scanner.nextLine());
        System.out.println(numero1 > numero2 ? "El primer numero es mayor" : "El segundo numero es mayor");

    }
}
