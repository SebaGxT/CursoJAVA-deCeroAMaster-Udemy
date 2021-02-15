package domain;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado() {

        this.idEmpleado = ++Empleado.contadorEmpleado;

    }

    public Empleado(String nombre, double sueldo) {

        /*La llamada a super siempre debe ser la primera llamada en 
        los constructores a menos que se llame a otro constructor interno
        
        En caso de llamar a un constructor interno ya no se puede realizar el llamado a super()
         */
        //super(nombre);
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {

        //super(nombre, genero, edad, direccion);
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
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
