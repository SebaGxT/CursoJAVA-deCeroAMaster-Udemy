/*

el metodo implementado en la clase hija se marca como sobreescritura porque esta definido en la clase padre
pero no se sobreescribe realmente ya que no tiene comportamiento y se implementa por primera vez en la clase hija

*/
package domain;


public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String tipoFigura){
        
        super(tipoFigura);
        
        
    }
    
    @Override
    public void dibujar(){
        
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
        
    }
    
}
