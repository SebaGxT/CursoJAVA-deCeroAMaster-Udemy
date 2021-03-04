package cpjlaboratoriofinal;

import ar.com.peliculas.negocio.*;
import java.util.Scanner;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        String peli;
        String nombreArchivo = null;

        while (opcion != 0) {

            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar catalogo peliculas\n"
                    + "2. Agregar peliculas\n"
                    + "3. Listar peliculas\n"
                    + "4. Buscar pelicula\n"
                    + "0. Salir\n"
                    + "Opcion: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {

                case 1: {

                    System.out.println("Inicio de catalogo\n"
                            + "Ingrese nombre del catalogo: "
                    );
                    nombreArchivo = scanner.nextLine();
                    catalogo.iniciarCatalogoPeliculas(nombreArchivo);

                    break;
                }

                case 2: {

                    if (nombreArchivo != null) {

                        System.out.println("Ingrese nombre de pelicula: ");
                        peli = scanner.nextLine();
                        catalogo.agregarPelicula(peli, nombreArchivo);

                    } else {

                        System.out.println("Debe iniciar un archivo primero");

                    }

                    break;
                }

                case 3: {

                    if (nombreArchivo != null) {

                        catalogo.listarPeliculas(nombreArchivo);

                    } else {

                        System.out.println("Debe iniciar un archivo primero");

                    }

                    break;
                }

                case 4: {

                    if (nombreArchivo != null) {

                        System.out.println("Ingrese pelicula a buscar: ");
                        peli = scanner.nextLine();
                        catalogo.buscarPelicula(nombreArchivo, peli);

                    } else {

                        System.out.println("Debe iniciar un archivo primero");

                    }

                    break;
                }

                case 0: {

                    System.out.println("Salio del catalogo");
                    break;
                }

                default:

                    System.out.println("Opcion invalida, vuelva a intentar porfavor");

            }

        }

    }

}
