package dominio;

public class Persona {

    /*Se utiliza el modificador private para que los atributos no puedan ser leidos ni modificados drectamente 
        aunque esten en el mismo paquete con otras clases
     */
    private String nombre;
    private String apellido;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, String apellido, double sueldo, boolean eliminado) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.eliminado = eliminado;

    }

    /*La opcion de Getter and Setter puede ser proporcionado por el IDE, se visualiza Click derecho
    Insert Code...*/
 /*El metodo Get es para recuperar informacion de un atributo*/
    public String getNombre() {

        return this.nombre;

    }

    public String getApellido() {

        return this.apellido;

    }

    public double getSueldo() {

        return this.sueldo;

    }
    
    //En los get para los boolean se usa is porque se interpreta como una pregunta
    public boolean isEliminado() {

        return this.eliminado;

    }

    /*El metodo Set es para modificar informacion de un atributo*/
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

}
