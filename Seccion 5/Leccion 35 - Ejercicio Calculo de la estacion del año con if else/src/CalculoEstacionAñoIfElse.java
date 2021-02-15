import java.util.Scanner;

public class CalculoEstacionAñoIfElse {
   public static void main(String args[]){
       
       Scanner scanner = new Scanner(System.in);
       
       int mes;
       
       System.out.println("Ingrese el mes:");
       mes = scanner.nextInt();
       
       var estacion = "Estacion desconocida";
       
       if(mes == 1 || mes == 2 || mes == 12){
           
           estacion = "El mes pertenece a verano";
           
       }else if(mes == 3 || mes == 4 || mes == 5){
           
           estacion = "El mes pertenece a otoño";
           
       }else if(mes == 6 || mes == 7 || mes == 8){
           
           estacion = "El mes pertenece a invierno";
           
       }else if(mes == 9 || mes == 10 || mes == 11){
           
           estacion = "El mes pertenece a primavera";
           
       }
       
       System.out.println("estacion = " + estacion);
       
   } 
}
