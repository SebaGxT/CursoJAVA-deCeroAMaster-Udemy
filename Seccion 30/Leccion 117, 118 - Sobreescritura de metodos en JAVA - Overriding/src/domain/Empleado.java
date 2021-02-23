/*

La sobreescritura de metodos se aplica en la herencia de clases ya que la sobreescritura significa 
que un metodo en la clase hija modifica el comportamiento en la clase padre

 */
package domain;

public class Empleado {

    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {

        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    public String obtenerDetalles() {

        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;

    }

    public String getNombre() {

        return this.nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public double getSueldo() {

        return this.sueldo;

    }

    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;

    }

}
