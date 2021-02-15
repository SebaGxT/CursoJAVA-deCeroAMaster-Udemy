package ar.com.mundopc;

public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    public static final int MAX_COMPUTADORAS = 10;

    public Orden() {

        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];

    }

    public int getIdOrden() {

        return this.idOrden;

    }

    public void agregarComputadora(Computadora computadora) {

        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {

            this.computadoras[this.contadorComputadoras++] = computadora;

        } else {

            System.out.println("No se puede agregar mas computadoras a la orden: " + Orden.MAX_COMPUTADORAS);

        }

    }

    public void mostrarOrden() {

        System.out.println("Numero de orden: " + getIdOrden());

        for (int i = 0; i < this.contadorComputadoras; i++) {

            System.out.println(this.computadoras[i]);

        }

    }

}
