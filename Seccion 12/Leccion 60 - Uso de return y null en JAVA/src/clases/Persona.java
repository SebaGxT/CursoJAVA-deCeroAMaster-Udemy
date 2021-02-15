package clases;

public class Persona {

    //Atributos de la clase
    public String nombre;
    public String apellido;

    //Constructores
    public Persona() {

        System.out.println("Contructor Objeto vacio");

    }

    public Persona(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;

        System.out.println("Constructor Objeto con carga");

    }

    //Metodos de la clase
    public void desplegarInformacion() {

        System.out.println("Nombre y apellido: " + this.nombre + " " + this.apellido);

    }

}
