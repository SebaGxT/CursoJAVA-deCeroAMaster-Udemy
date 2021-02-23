
/*

para poder heredar de una clase de otro paquete se debe importar el paquete

 */
package paquete2;

import paquete1.Clase1;

public class Clase2 extends Clase1 {

    public Clase2() {

        super();
        this.atributoProtected = "Valor atributo protected desde Clase2";
        this.metodoProtected();
        System.out.println("Atributo protegido: " + this.atributoProtected);

    }

}
