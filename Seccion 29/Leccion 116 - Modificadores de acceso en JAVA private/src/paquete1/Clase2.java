package paquete1;

/*

para utilizar el constructor de la clase padre debe crearse un constructor publico en la clase padre y desde las hijas
mandar a llamar ese constructor publico, desde la clase padre se utiliza this(); con los argumentos necesarios 
para llamar al constructor privado.

*/

public class Clase2 extends Clase1 {

    public Clase2() {

        super("Publico");
//        this.atributoPrivate = "Valor atributo default desde Clase2";
//        this.metodoPrivate();
//        System.out.println("Atributo private: " + this.atributoPrivate);

    }

}
