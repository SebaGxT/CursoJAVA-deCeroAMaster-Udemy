package ar.com.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor() {

        this.idMonitor = ++Monitor.contadorMonitores;

    }

    public Monitor(String marca, double tamanio) {

        this();
        this.marca = marca;
        this.tamanio = tamanio;

    }

    @Override
    public String toString() {
        return "{ " + "idMonitor: " + idMonitor + ", marca: " + marca + ", tamanio: " + tamanio + '}';
    }

}
