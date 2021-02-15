
public class OperadoresCondicionales {
    public static void main(String args[]){
        
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = (a >= valorMinimo && a <= valorMaximo);
        
        if(resultado){
            
            System.out.println("Esta dentro del rango");
            
        }else{
            
            System.out.println("Esta fuera del rango");
            
        }
        
        var vacaciones = false;
        var diaDescanso = false;
        
        if(vacaciones || diaDescanso){
            
            System.out.println("El padre puede ir al juego de su hijo");
            
        }else{
            
            System.out.println("El padre no puede ir al juego de su hijo");
            
        }
        
    }
}
