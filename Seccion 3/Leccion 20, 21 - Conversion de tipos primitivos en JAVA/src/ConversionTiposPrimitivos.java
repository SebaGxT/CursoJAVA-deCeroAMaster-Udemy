import java.util.Scanner;

public class ConversionTiposPrimitivos {
    public static void main(String args[]){
        
        //Convertir tipo String a tipo Int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        //Convertir tipo String a tipo Double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir valor
        var consola = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Edad = " + edad);
        
        //Convertir tipo Int a tipo String        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //Tomar un caracter de un String y guardarlo en un char
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
}
