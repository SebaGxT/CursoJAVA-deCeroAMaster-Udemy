package domain;

//Los constructores no se heredan pero pueden accederse a travez de super()
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado() {

        this.idEmpleado = ++Empleado.contadorEmpleado;

    }

    public Empleado(String nombre, double sueldo) {

        super(nombre);

        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;

    }

    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {

        super(nombre, genero, edad, direccion);

        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;

    }

    public int getIdEmpleado() {

        return this.idEmpleado;

    }

    public double getSueldo() {

        return this.sueldo;

    }

    public void setSueldo(double sueldo) {

        this.sueldo = sueldo;

    }

    /*
    Los objetos de tipo String en JAVA son inmutables una vez que se asignan ya no se pueden modificar.
    Por cada concatenacion se crea un nuevo objeto de tipo String
    
    Se puede utilizar el StringBuilder de JAVA, es una clase que permite modificar sus valores que utiliza
    append para concatenar cada objeto String
    
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Empleado { ID Empleado: ").append(this.idEmpleado);
        sb.append(", Sueldo: \u0024").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append(" }");
        return sb.toString();

    }

}
