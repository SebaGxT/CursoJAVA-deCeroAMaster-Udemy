public class OperadoresUnarios {
    public static void main(String args[]){
        
        var a = 3;
        var b = -a;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Incremento - Dos variantes
        //1.Preincremento (Simbolo antes de la variable)
        var e = 3;
        var f = ++e;//Primero incrementa la variable luego utiliza su valor
        
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //2.Postincremento (Simbolo despues de la variable)
        var g = 5;
        var h = g++;//Primero se utiliza el valor y luego se incrementa. Se incrementa al volver a utilizar la variable a incrementar.
        
        System.out.println("g = " + g);//Tenia pendiente un incremento.
        System.out.println("h = " + h);
        
        //Funciona igual con el decremento
        //1.Predecremento
        var i = 2;
        var j = --i;
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //2.Postdecremento
        var k = 4;
        var l = k--;
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
    }
    
}
