package Operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    //Metodos de la clase
    public int sumarConRetorno() {

        return this.a + this.b;

    }

    public int sumaParametros(int a, int b) {

        this.a = a; //El argumento a se asigna al atributo this.a
        this.b = b; //El argumento b se asigna al atributo thi.b

        return this.sumarConRetorno();

    }

}
