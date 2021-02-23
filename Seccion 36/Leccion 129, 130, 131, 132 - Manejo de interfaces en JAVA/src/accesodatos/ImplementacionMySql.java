/*

Al utilizar implements en una interface esta obligado a implementar los metodos definidos ya que si no se debe declarar
como clase abstracta

 */
package accesodatos;

public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {

        System.out.println("Insertar desde MySql");

    }

    @Override
    public void listar() {

        System.out.println("Listar desde MySql");

    }

    @Override
    public void actualizar() {

        System.out.println("Actualizar desde MySql");

    }

    @Override
    public void eliminar() {

        System.out.println("Eliminar desde MySql");

    }

}
