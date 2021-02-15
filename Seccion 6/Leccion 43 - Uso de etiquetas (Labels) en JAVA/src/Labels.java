
public class Labels {

    public static void main(String args[]) {

        inicio:
        for (int i = 0; i < 3; i++) {

            if (i % 2 != 0) {

                continue inicio;//GO TO - EN JAVA ETIQUETAS - Mueve la ejecucion a la etiqueta establecida

            }

            System.out.println("i = " + i);

        }

    }
}
