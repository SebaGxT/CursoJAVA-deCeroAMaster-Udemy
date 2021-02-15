package domain;

import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente() {

        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = new Date();

    }

    public Cliente(String nombre, boolean vip) {

        this();
        //super(nombre);
        //Date fechaRegistro1 = new Date();
        //this.idCliente = ++Cliente.contadorCliente;
        //this.fechaRegistro = fechaRegistro1;
        this.nombre = nombre;
        this.vip = vip;

    }

    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip) {

//        super(nombre, genero, edad, direccion);
//        Date fechaRegistro1 = new Date();
//        this.idCliente = ++Cliente.contadorCliente;
//        this.fechaRegistro = fechaRegistro1;
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.vip = vip;

    }

    public int getIdCliente() {

        return this.idCliente;

    }

    public Date getFechaRegistro() {

        return this.fechaRegistro;

    }

    public void setFechaRegistro(Date fechaRegistro) {

        this.fechaRegistro = fechaRegistro;

    }

    public boolean isVip() {

        return this.vip;

    }

    public void setVip(boolean vip) {

        this.vip = vip;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente { ID Cliente: ").append(idCliente);
        sb.append(", Fecha de registro: ").append(fechaRegistro);
        sb.append(", Vip: ").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
