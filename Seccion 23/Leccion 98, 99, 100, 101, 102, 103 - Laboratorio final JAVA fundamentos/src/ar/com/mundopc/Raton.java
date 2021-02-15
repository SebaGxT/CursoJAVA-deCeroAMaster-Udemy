package ar.com.mundopc;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {

        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;

    }

    public int getIdRaton() {

        return this.idRaton;

    }

    @Override
    public String toString() {
        return "{ " + "idRaton: " + idRaton + ", " + super.toString() + " }";
    }

}
