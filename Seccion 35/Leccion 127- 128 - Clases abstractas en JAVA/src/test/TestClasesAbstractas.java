/*

Las clases abstractas no pueden ser instanciadas

*/
package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        
        //FiguraGeometrica figura1 = new FiguraGeometrica();
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        
        figura.dibujar();
        
        
        
    }
}
