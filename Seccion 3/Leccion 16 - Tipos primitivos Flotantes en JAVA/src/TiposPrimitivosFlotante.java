
public class TiposPrimitivosFlotante {
    public static void main(String args[]){
        
        /*
            Tipos primitivos de tipo flotante: float y double
        
        */
        
        float numeroFloat = 3.4028235E38F; /* Los valores flotantes literales en JAVA son double y no pueden almacenarse directamente en float
        ya que float es de 32 bits y double de 64 bits. Se agrega F para convertir la literal en float y en mayuscula por convencion*/
        float numero2Float = (float)3.4028236E38D;
        System.out.println("Valor minimo de float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo de float:" + Float.MAX_VALUE);
        System.out.println("Valor float:" + numeroFloat);
        System.out.println("Valor float sobrepasado:" + numero2Float);
        
        double numeroDouble = 1.7976931348623157E308;
        double numero2Double = 1.7976931348623158E308;
        System.out.println("Valor minimo de double:" + Double.MIN_VALUE);
        System.out.println("Valor maxima de double:" + Double.MAX_VALUE);
        System.out.println("Valor double:" + numeroDouble);
        System.out.println("Valor double sobrepasado:" + numero2Double);
        
    }
}
