package domain;

import java.util.Date;

//Los constructores no se heredan pero pueden accederse a travez de super()
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

        super(nombre);
        
        Date fechaRegistro1 = new Date();
        
        this.idCliente = ++Cliente.contadorCliente;
        this.vip = vip;
        this.fechaRegistro = fechaRegistro1;

    }

    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip) {

        super(nombre, genero, edad, direccion);
        
        Date fechaRegistro1 = new Date();
        
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro1;
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
