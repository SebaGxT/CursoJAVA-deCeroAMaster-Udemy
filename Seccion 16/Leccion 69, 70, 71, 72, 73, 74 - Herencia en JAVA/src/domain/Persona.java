package domain;

//Cuando no se especifica extends en una clase de manera automatica el compilador agrega extends object
//Todas las clases de manera directa o indirecta heredan de la clase object
public class Persona {

    //Todos los atributos privados no se heredan a las clases hijas
    /*Para que las clases hijas puedan acceder a los atributos de manera directa deben tener el modificador protected 
    y no importa si estan o no en el mismo paquete. Si los atributos tienen modificador private pueden acceder de manera
    indirecta atraves de los metodos get y set*/
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

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
