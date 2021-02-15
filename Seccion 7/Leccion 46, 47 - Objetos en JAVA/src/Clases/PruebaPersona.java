package Clases;

public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Marly";
        persona1.apellido = "Donzelli";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        
        persona2.desplegarInformacion();
        persona2.nombre = "Sebastian";
        persona2.apellido = "De la Vega";
        persona2.desplegarInformacion();
        
    }
    
}
