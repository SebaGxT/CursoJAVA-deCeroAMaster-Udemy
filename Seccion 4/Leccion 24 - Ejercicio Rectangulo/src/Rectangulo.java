
import java.util.Scanner;

public class Rectangulo {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int alto, ancho;

        System.out.println("Ingrese el alto:");
        alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el ancho:");
        ancho = Integer.parseInt(scanner.nextLine());
        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
