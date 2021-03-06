package domain;

public class Persona {

    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //Al tener mas de un constructor se aplica lo que se conoce como sobrecarga de constructores
    public Persona() {

    }

    public Persona(String nombre) {

        this.nombre = nombre;

    }

    public Persona(String nombre, char genero, int edad, String direccion) {

        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;

    }

    public String getNombre() {

        return this.nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public char getGenero() {

        return this.genero;

    }

    public void setGenero(char genero) {

        this.genero = genero;

    }

    public int getEdad() {

        return this.edad;

    }

    public void setEdad(int edad) {

        this.edad = edad;

    }

    public String getDireccion() {

        return this.direccion;

    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona { Nombre: ").append(nombre);
        sb.append(", Genero: ").append(genero);
        sb.append(", Edad: ").append(edad);
        sb.append(", Direccion: ").append(direccion);
        sb.append('}');
        sb.append(", ").append(super.toString());
        return sb.toString();
    }

}
