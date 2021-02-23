package domain;

public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoescritura) {

        super(nombre, sueldo);
        this.tipoEscritura = tipoescritura;

    }

    @Override
    public String obtenerDetalles() {

        return super.obtenerDetalles() + ", Tipo de escritura: " + this.tipoEscritura.getDescripcion();

    }

    @Override
    public String toString() {
        return super.toString() + " Escritor{" + "tipo de escritura: " + tipoEscritura + '}';
    }
    
    public TipoEscritura getTipoEscritura(){
        
        return this.tipoEscritura;
        
    }

}
