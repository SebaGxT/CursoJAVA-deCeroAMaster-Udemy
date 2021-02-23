/*
Conversion de una clase padre a hijo se la conoce como downcasting
Conversion de una clase hijo a padre se la conoce como upcasting


 */
package test;

import domain.*;

public class TestConversionObjetos {
    
    public static void main(String[] args) {
        
        Empleado empleado;
        
        empleado = new Escritor("Sebastian", 42000, TipoEscritura.MODERNO);
        
        //System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());
        
        //downcasting se convierte de la clase padre a la hija
        //System.out.println(((Escritor)empleado).getTipoEscritura());
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscritura());
        
        //Upcasting no es necesario hacer una conversion explicita ya que el padre puede soportar objetos hijos
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
   
    }
    
}
