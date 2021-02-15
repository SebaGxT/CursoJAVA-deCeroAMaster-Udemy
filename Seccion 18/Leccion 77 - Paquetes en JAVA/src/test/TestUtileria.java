package test;

//importar todos los metodos de la clase
//import ar.com.cursoJAVA.*;
//importa un metodo especifico de la clase
//import ar.com.cursoJAVA.Utileria;
//importar metodos estaticos
//import static ar.com.cursoJAVA.Utileria.imprimir;

public class TestUtileria {

    public static void main(String[] args) {
        
        //import normal
        //Utileria.imprimir("Saludos");
        
        //import static
        //imprimir("Saludos");
        
        //Para usar un metodo sin especificar el import debe ponerse el nombre completamente calificado
        ar.com.cursoJAVA.Utileria.imprimir("Saludos");
    }
}
