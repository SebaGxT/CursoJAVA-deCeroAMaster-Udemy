
public class IgualdadYRelacionales {
    public static void main(String args[]){
        
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = (a != b);
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var e = cadena == cadena2;//Compara referencias de objetos
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2);//.equals se utiliza para comparar las cadenas (contenido de las variables)
        System.out.println("f = " + f);
        
        var g = (a >= b);// > mayor, < menor, >= mayor igual, <= menor igual, == igual, != distinto
        System.out.println("g = " + g);
        
        if( a % 2 == 0){
            
            System.out.println("Es numero par");
            
        }else{
            
            System.out.println("Es numero impar");
            
        }
        
        var edad = 10;
        var adulto = 18;
        
        if(edad >= adulto){
            
            System.out.println("Es mayor de edad");
            
        }else{
            
            System.out.println("Es menor de edad");
            
        }
        
    }
}
