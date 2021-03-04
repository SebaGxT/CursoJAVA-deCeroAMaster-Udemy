package ar.com.peliculas.negocio;

public interface ICatalogoPeliculas {

    void agregarPelicula(String nombrePelicula, String nombreArchivo);

    void listarPeliculas(String nombreArchivo);

    void buscarPelicula(String nombreArchivo, String buscar);

    void iniciarCatalogoPeliculas(String nombreArchivo);

}
