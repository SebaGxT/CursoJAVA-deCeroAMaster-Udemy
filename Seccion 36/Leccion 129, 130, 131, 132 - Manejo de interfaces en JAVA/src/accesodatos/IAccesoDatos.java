/*

Una interface es similar a una clase abstracta en el sentido en que los metodos de la interface tampoco van a tener 
una implementacion. Los metodos de la interface tambien son abstractos y si se agregan atributos estos son constantes 
public final static.
La diferecia entre una clase abstracta y una interface es que las clases abstractas se utilizan por caracteristicas 
distintas por ejemplo la clase FiguraGeometrica y sus clases hijas cuadrado, circulo y triangulo.
Las interfaces se utilizan mas por los comportamientos en comun de la clase y no las caracteristicas heredadas.

Es comun poner la letra I al inicio de los nombres para indicar que es interface

por default la interface no extiende de ninguna clase pero si puede extenderse de otras interfaces
las constantes se definen public final static sin necesidad de escribirlo
Se deben definir valores en las constantes ya que las interfaces no tienen constructores.
Cualquier metodo que se agrege va a ser public y abstracto

*/
package accesodatos;


public interface IAccesoDatos {
    
    int MAX_REGISTROS = 10;
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
}
