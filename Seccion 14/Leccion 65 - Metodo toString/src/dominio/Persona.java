package dominio;

public class Persona {

    private String nombre;
    private String apellido;
    private double sueldo;
    private boolean eliminado;

    public Persona() {

    }

    public Persona(String nombre, String apellido, double sueldo, boolean eliminado) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.eliminado = eliminado;

    }

    public String getNombre() {

        return this.nombre;

    }

    public String getApellido() {

        return this.apellido;

    }

    public double getSueldo() {

        return this.sueldo;

    }

    public boolean isEliminado() {

        return this.eliminado;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApellido(String apellido) {

        this.apellido = apellido;

    }

    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;

    }

    public void setEliminado(boolean eliminado) {

        this.eliminado = eliminado;

    }

    //toString permite imprimir el estado de los objetos
    public String toString() {

        return "Persona [Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Sueldo: "
                + this.sueldo + ", Estado eliminado: " + this.eliminado + "]";

    }

}
