package ar.com.mundopc;

public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {

        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;

    }

    public int getIdTeclado() {

        return this.idTeclado;

    }

    @Override
    public String toString() {
        return "{ " + "idTeclado: " + idTeclado + ", " + super.toString() + " }";
    }

}
