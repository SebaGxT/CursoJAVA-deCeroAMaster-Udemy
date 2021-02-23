
/*

para poder heredar de una clase de otro paquete se debe importar el paquete

 */
package paquete1;

public class Clase2 extends Clase1 {

    public Clase2() {

        super();
        this.atributoDefault = "Valor atributo default desde Clase2";
        this.metodoDefault();
        System.out.println("Atributo default: " + this.atributoDefault);

    }

}
