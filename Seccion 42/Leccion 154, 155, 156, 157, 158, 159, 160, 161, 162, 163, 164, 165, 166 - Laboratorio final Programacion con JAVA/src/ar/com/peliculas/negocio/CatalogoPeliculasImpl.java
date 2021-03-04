package ar.com.peliculas.negocio;

import ar.com.peliculas.datos.AccesoDatosImpl;
import ar.com.peliculas.datos.IAccesoDatos;
import ar.com.peliculas.domain.Pelicula;
import ar.com.peliculas.excepciones.AccesoDatosEx;
import ar.com.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private IAccesoDatos datos;

    public CatalogoPeliculasImpl() {

        this.datos = new AccesoDatosImpl();

    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {

        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;

        try {

            anexar = datos.existe(nombreArchivo);
            datos.escribir(pelicula, nombreArchivo, anexar);

        } catch (AccesoDatosEx ex) {

            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);

        }

    }

    @Override
    public void listarPeliculas(String nombreArchivo) {

        try {

            if (this.datos.existe(nombreArchivo)) {

                var peliculas = this.datos.listar(nombreArchivo);
                for (var pelicula : peliculas) {

                    System.out.println("pelicula: " + pelicula);

                }

            } else {

                System.out.println("Archivo no existe");

            }

        } catch (LecturaDatosEx ex) {

            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);

        } catch (AccesoDatosEx ex) {

            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);

        }

    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {

        String resultado = null;

        try {

            if (this.datos.existe(nombreArchivo)) {

                resultado = this.datos.buscar(nombreArchivo, buscar);
                if (resultado != null) {

                    System.out.println("resultado: " + resultado);

                } else {

                    System.out.println("La pelicula no existe");

                }

            } else {

                System.out.println("Archivo no existe");

            }

        } catch (LecturaDatosEx ex) {

            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);

        } catch (AccesoDatosEx ex) {

            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);

        }

    }

    @Override
    public void iniciarCatalogoPeliculas(String nombreArchivo) {

        try {

            if (this.datos.existe(nombreArchivo)) {

                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);

            } else {

                datos.crear(nombreArchivo);

            }

        } catch (AccesoDatosEx ex) {

            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);

        }

    }

}
