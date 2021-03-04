package ar.com.peliculas.datos;

import ar.com.peliculas.domain.Pelicula;
import ar.com.peliculas.excepciones.*;
import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        return archivo.exists();

    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {

        File archivo = new File(nombreArchivo);

        List<Pelicula> peliculas = new ArrayList<>();

        try {

            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {

                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();

            }
            entrada.close();

        } catch (FileNotFoundException ex) {

            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());

        } catch (IOException ex) {

            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());

        }

        return peliculas;

    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {

        File archivo = new File(nombreArchivo);
        try {

            var salida = new PrintWriter(new FileWriter(archivo, anexar));

            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: " + pelicula);

        } catch (IOException ex) {

            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + ex.getMessage());

        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {

        File archivo = new File(nombreArchivo);
        String resultado = null;

        try {

            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            String linea = null;
            linea = entrada.readLine();
            int i = 1;
            while (linea != null) {
                //Realiza la comparacion sin tomar en cuenta mayuscula y minuscula
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {

                    resultado = "Pelicula " + linea + " encontrada en el indice " + i;
                    break;

                }

                linea = entrada.readLine();
                i++;

            }

            entrada.close();

        } catch (FileNotFoundException ex) {

            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas: " + ex.getMessage());

        } catch (IOException ex) {

            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas: " + ex.getMessage());

        }

        return resultado;

    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {

        File archivo = new File(nombreArchivo);

        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");

        } catch (IOException ex) {

            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear archivo: " + ex.getMessage());

        }

    }

    @Override
    public void borrar(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        if (archivo.exists()) {

            archivo.delete();
            System.out.println("Se a borrado el archivo");

        }

    }

}
