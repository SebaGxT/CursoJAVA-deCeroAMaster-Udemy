
import java.util.Scanner;

public class SwitchEnJava {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        var numeroTexto = "Numero desconocido";

        System.out.println("Ingrese un numero:");
        numero = scanner.nextInt();

        switch (numero) {

            case 1: {

                numeroTexto = "Numero uno";
                break;

            }

            case 2: {

                numeroTexto = "Numero dos";
                break;

            }

            case 3: {

                numeroTexto = "Numero tres";
                break;

            }

            case 4: {

                numeroTexto = "Numero cuatro";
                break;

            }

            default:
                numeroTexto = "Numero no encontrado";

        }

        System.out.println("numeroTexto = " + numeroTexto);

    }
}
