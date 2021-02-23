/*

Cuando se trabaja con protected la idea es permitir a las clases hijas de una clase poder acceder a los constructores
o metodos definidos en la clase padre, aunque los constructores no se heredan se puede utilizar super() para hacer uso
del mismo. al usar protected en los constructores no quiere decir que se hereden sino que se puede utilizar super() para
accederlos. el uso de super() no es lo mismo que herencia, herencia es cuando se accede directamente a los atributos o 
metodos de la clase

Modificador     Clase       Variable        Metodo      Constructor

public           si             si             si           si
protected        no             si             si           si
default*         si             si             si           si   default o package
private          no             si             si           si

protected no aplica en clases


*/
package paquete1;


public class Clase1 {
    
    protected String atributoProtected = "Valor atributo protected";
    
    protected Clase1(){
        
        System.out.println("Constructor Protected");
        
    }
    
    public Clase1(String arg){
        
        System.out.println("Constructor publico");
        
    }
    
    protected void metodoProtected(){
        
        System.out.println("Metodo protected");
        
    }
    
}
