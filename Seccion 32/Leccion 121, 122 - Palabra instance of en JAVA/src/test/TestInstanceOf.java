/*

La funcion determinarTipo va a funcionar en ejecucion y se refiere al lado derecho de las declaraciones de los objeto 
empleado o gerente, ya que si se determina el tipo de la variable empleado siempre va a ser objeto empleado.

instance of normalmente se utiliza para preguntar
en primer lugar se recomienda empezar a preguntar por lo mas especifico a lo mas general
de las clases hijas a las clases padre hasta llegar a la clase object en caso de ser necesario

en este ejemplo si solo se colocaran tres if separados indicaria que es verdadero en los tres ya que Gerente
es un object de tipo gerente hija de la clase empleado por eso al usar el if encadenado se va desde lo mas particular 
a lo mas general


Una caracteristica que puede realizar instanceof es que permite convertir una variable de tipo padre a una de tipo hijo
lo que permitiria volver a tener acceso a los atributos de la clase hija

existen dos formas para esto

1) Declarar una variable local de la clase hija y asignarle la referencia pasada por parametro pero se debe hacer una
conversion --> Gerente gerente = (Gerente)empleado;
2) Es utilizar la conversion directa en ejecucion --> ((Gerente) empleado).getDepartamento();


 */
package test;

import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Sebastian", 25000);

        determinarTipo(empleado);

        empleado = new Gerente("Sebastian", 42000, "TI");

        determinarTipo(empleado);

    }

    public static void determinarTipo(Empleado empleado) {

        if (empleado instanceof Gerente) {

            System.out.println("Es clase Gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.obtenerDetalles());
            System.out.println("Departamento del Gerente: "+gerente.getDepartamento());

        } else if (empleado instanceof Empleado) {

            System.out.println("Es clase Empleado");
            /*
                Gerente gerente = (Gerente)empleado;
                System.out.println("Departamento del Gerente: "+gerente.getDepartamento());
            
            este codigo daria un error en tiempo ejecucion ya que el objeto que se evalua en este caso
            es de la clase padre
            
            */
            System.out.println("empleado = " + empleado.obtenerDetalles());

        }else if(empleado instanceof Object){
            
            System.out.println("Es tipo objeto");
            
        }

    }

}
