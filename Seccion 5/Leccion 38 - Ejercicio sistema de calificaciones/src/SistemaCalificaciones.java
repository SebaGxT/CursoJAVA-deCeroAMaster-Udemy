
import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
         
        int nota;
        var calificacion = "Valor desconocido";
        
        System.out.println("Ingrese la nota entre 1 y 10:");
        nota = scanner.nextInt();
        
        if(nota>8 && nota<11){
            
            calificacion = "A";
            
        }else if(nota == 8){
            
            calificacion = "B";
            
        }else if(nota == 7){
            
            calificacion = "C";
            
        }else if(nota == 6){
            
            calificacion = "D";
            
        }else if(nota>-1 && nota<6){
            
            calificacion = "F";
            
        }else{
            
            calificacion = "Valor desconocido";
            
        }
        
        System.out.println("calificacion = " + calificacion);
        
    }
}
