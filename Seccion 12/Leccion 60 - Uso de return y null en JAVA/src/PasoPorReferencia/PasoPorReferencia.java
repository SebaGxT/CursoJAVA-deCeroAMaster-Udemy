package PasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        //Persona persona1 = null;
        //Una variable que todavia no apunta a ningun objeto va a marcar error en tiempo de ejecucion
        //No se puede acceder a los atributos o metodos sin apuntar a un objeto
        persona1.nombre = "Marly";
        persona1.apellido = "Donzelli";
        persona1.desplegarInformacion();
        //Este pase debe depositarse en una variable tipo object que es lo que se envia como parametro
        persona1 = cambiarValor(persona1);
        if (persona1 != null){
            
            persona1.desplegarInformacion();
            
        }else{
            
            System.out.println("La variable persona1 no esta apuntando a ningun objeto");
            
        }

    }

    //Regresar un objeto, se especifica que se va a regresar un tipo object en este caso Persona (public static Persona)    
    public static Persona cambiarValor(Persona persona) {

        if (persona == null) {
            
            System.out.println("Valor de persona invalido: null");
            return null;
            /*Return es la ultima linea que se ejecuta en los metodos luego del return 
            ya no puede ejecutarse ninguna linea*/
        } else {

            persona.nombre = "Sebastian";
            persona.apellido = "De la Vega";

        }

        return persona;

    }

}
