
public class TipoPrimitivoBool {
    
    public static void main(String args[]){
        
        boolean varBool = true;
        System.out.println("varBool = " + varBool);
        boolean var2Bool = false;
        System.out.println("var2Bool = " + var2Bool);
        
        //Es lo mismo if(varBool) que if(varBool == true)
        //Es lo mismo if(!varBool) que if(varBool != true)
        if(varBool){
            
            System.out.println("La bandera es verdadera");
            
        }else{
            
            System.out.println("La bandera es falsa");
            
        }
        
        var edad = 30;
        //var esAdulto = edad >= 18;
        
        if(edad >= 18){
            
            System.out.println("Es mayor de edad");
            
        }else{
            
            System.out.println("Es menor de edad");
            
        }
        
    }
    
}
