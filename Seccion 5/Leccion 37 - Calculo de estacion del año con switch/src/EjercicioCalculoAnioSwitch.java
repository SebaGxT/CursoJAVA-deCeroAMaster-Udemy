
import java.util.Scanner;

public class EjercicioCalculoAnioSwitch {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int mes;
        var estacion = "Estacion desconocida";

        System.out.println("Ingrese el mes:");
        mes = scanner.nextInt();

        switch (mes) {

            case 1:
            case 2:
            case 12: {

                estacion = "Estacion de verano";
                break;

            }
            case 3:
            case 4:
            case 5: {

                estacion = "Estacion de otoño";
                break;

            }
            case 6:
            case 7:
            case 8: {

                estacion = "Estacion de invierno";
                break;

            }
            case 9:
            case 10:
            case 11: {

                estacion = "Estacion de primavera";
                break;

            }
            default:

                estacion = "Estacion inexistente";

        }

        System.out.println("estacion = " + estacion);

    }
}
