/*

Para el uso de una clase abstracta se la define como abstract, se la utiliza para definir metodos
que no tienen ninguna implementacion por lo tanto estos metodos tambien se marcan como abstract si una clase
tiene por lo menos un metodo abstract toda la clase se tiene que marcar como abstract incluso se pueden 
crear clases abstractas que no tengan metodos abstract pero lo comun es que si la clase esta marcada 
como abstract por lo menos tiene un metodo abstract

en este ejemplo se utiliza la clase padre FiguraGeometrica como abstracta ya que contiene un metodo dibujarfigura
pero no se determina que tipo de figura dibujar por lo que eso se define con clases hijas
no se esta obligado a agregar ningun comportamiento a los metodos de la clase padre ya que estos se van a definir en las
hijas

 */
package domain;

public abstract class FiguraGeometrica {

    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) {

        this.tipoFigura = tipoFigura;

    }

    public abstract void dibujar();

    public String getTipoFigura() {
        
        return this.tipoFigura;
        
    }

    public void setTipoFigura(String tipoFigura) {
        
        this.tipoFigura = tipoFigura;
        
    }

    @Override
    public String toString() {
        
        return "FiguraGeometrica{" + "tipoFigura: " + tipoFigura + '}';
        
    }

}
