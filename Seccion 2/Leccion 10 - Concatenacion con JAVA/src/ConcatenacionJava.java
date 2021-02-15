
public class ConcatenacionJava {

    public static void main(String args[]) {

        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;

        System.out.println(union);
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i+j);//Suma de numeros
        System.out.println(i+j+usuario);//Suma de numeros y se concatena la cadena
        System.out.println(usuario+i+j);/*Concatenacion de la palabra con los numeros.
        Contexto cadena, si primero encuentra una cadena el resto lo toma como cadena*/
        System.out.println(usuario+(i+j));//Los parentesis permiten realizar la suma y luego concatenar con la cadena
        
    }
}
