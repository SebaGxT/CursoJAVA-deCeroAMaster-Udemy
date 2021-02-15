package ar.com.ventastest;

import java.util.Scanner;
import ar.com.ventas.Producto;
import ar.com.ventas.Orden;

public class VentasTest {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double precio;
        
        Orden orden1 = new Orden();
        
        System.out.println("Ingrese el producto: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el precio: ");
        precio = Double.parseDouble(scanner.nextLine());
        
        Producto producto1 = new Producto(nombre,precio);
                
        System.out.println("Ingrese el producto: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el precio: ");
        precio = Double.parseDouble(scanner.nextLine());
        
        Producto producto2 = new Producto(nombre,precio);
        
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
    }
}
