/*

Modificador     Clase       Variable        Metodo      Constructor

public           si             si             si           si
protected        no             si             si           si
default*         si             si             si           si   default o package
private          no             si             si           si

Las clases no pueden ser private
Cuando se trabaja con atributos privados ya no pueden ser modificados directamente fuera de la clase donde se definio
para poder leerlo o modificarlo se deben usar el encapsulamiento con los metodos get y set respectivos

los constructores privados solo pueden ser utilizados dentro de la clase

para modificar y leer los atributos deben ser a traves de get y set

 */
package paquete1;

class Clase1 {

    private String atributoPrivate = "Valor atributo private";

    private Clase1() {

        System.out.println("Constructor private");

    }

    public Clase1(String arg) {

        this();
        System.out.println("Constructor publico");

    }

    private void metodoPrivate() {

        System.out.println("Metodo private");

    }

    public String getAtributoPrivate() {
        
        return this.atributoPrivate;
        
    }

    public void setAtributoPrivate(String atributoPrivate) {
        
        this.atributoPrivate = atributoPrivate;
        
    }

}
