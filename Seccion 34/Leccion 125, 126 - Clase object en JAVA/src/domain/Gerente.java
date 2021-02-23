package domain;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {

        super(nombre, sueldo);
        this.departamento = departamento;

    }

    public String getDepartamento() {

        return this.departamento;

    }

    public void setDepartamento(String departamento) {

        this.departamento = departamento;

    }

    @Override
    public String obtenerDetalles() {

        return super.obtenerDetalles() + ", Departamento: " + this.departamento;

    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "departamento:" + departamento + '}';
    }

}