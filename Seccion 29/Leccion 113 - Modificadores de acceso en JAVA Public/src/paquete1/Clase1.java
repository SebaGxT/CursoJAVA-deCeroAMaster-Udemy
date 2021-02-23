/*

Modificador     Clase       Variable        Metodo      Constructor

public           si             si             si           si
protected        no             si             si           si
default*         si             si             si           si   default o package
private          no             si             si           si

orden de menos restrictivo a mas restrictivo de arriba hacia abajo
default o package es la ausencia de modificador, cuando no se indica ningun modificador es default o package
este puede escribirse o no



Los paquetes public pueden utilizarse en cualquier parte sea dentro del mismo paquete o fuera de este
Los atributos public tambien pueden ser accedidos sin restricciones desde cualquier clase y puede ser modificado
Los constructores publc pueden ser accedidos desde cualquier clase sin restricciones para crear objetos de esta clase
Los metodos public no tienen restricciones para ser accedidos desde cualquier clase

*/

package paquete1;

public class Clase1 {
    
    public String atributoPublico = "Valor atributo publico";
    
    public Clase1(){
        
        System.out.println("Constructor publico");
        
    }
    
    
    public void metodoPublico(){
        
        System.out.println("Metodo publico");
        
    }
    
}
