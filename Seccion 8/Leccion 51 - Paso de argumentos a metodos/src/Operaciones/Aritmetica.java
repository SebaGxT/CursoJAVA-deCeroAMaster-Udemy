package Operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    //Metodos de la clase
    public int sumarConRetorno() {

//        int resultado = a + b;
//        return resultado;

        return (a + b);
        
    }

    public int sumaParametros(int n1, int n2) {

        a = n1;
        b = n2;
        return sumarConRetorno();

    }

}
