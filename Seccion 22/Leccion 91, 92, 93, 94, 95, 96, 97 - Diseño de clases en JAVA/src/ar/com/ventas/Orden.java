package ar.com.ventas;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private final static int MAX_PRODUCTOS = 10;
    private int contadorProductos;

    public Orden() {

        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];

    }

    public int getIdOrden() {

        return this.idOrden;

    }

    public int getMAX_PRODUCTOS() {

        return Orden.MAX_PRODUCTOS;

    }

    public void agregarProducto(Producto producto) {

        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {

            this.productos[this.contadorProductos++] = producto;

        } else {

            System.out.println("No se puede agregar mas productos a la orden: " + getMAX_PRODUCTOS());

        }

    }

    public double calcularTotal() {

        double total = 0;

        for (int i = 0; i < this.contadorProductos; i++) {

            if (this.productos[i] != null) {

                total += this.productos[i].getPrecio();

            }

        }

        return total;

    }

    public void mostrarOrden() {

        System.out.println("Numero de orden: " + getIdOrden());

        for (int i = 0; i < this.contadorProductos; i++) {

            System.out.println(this.productos[i]);

        }

        System.out.println("Total de la orden = $" + this.calcularTotal());

    }

}
