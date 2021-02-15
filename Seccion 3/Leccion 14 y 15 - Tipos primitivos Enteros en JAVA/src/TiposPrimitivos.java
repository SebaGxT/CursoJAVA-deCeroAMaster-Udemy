
public class TiposPrimitivos {

    public static void main(String args[]) {

        /*
        
        Tipos primitivos enteros: byte, short, int, long
        
         */
        //Byte
        System.out.println("Valor minimo de byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo de byte:" + Byte.MAX_VALUE);
        byte numeroByte = 127;
        byte numero2Byte = (byte)/*Con los parentesis convierte a byte el literal de 129*/ 129;
        //Posible perdida de informacion al convertir de int a byte ya que el valor sobrepasa la capacidad
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor byte sobreapasado:" + numero2Byte);

        //Short
        System.out.println("Valor minimo de short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo de short:" + Short.MAX_VALUE);
        short numeroShort = 32767;
        short numero2Short = (short) 32768;
        System.out.println("Valor short:" + numeroShort);
        System.out.println("Valor short sobrepasado:" + numero2Short);

        //Int
        System.out.println("Valor minimo de int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo de int:" + Integer.MAX_VALUE);
        int numeroInt = 2147483647;
        int numero2Int = (int) 2147483648L; //Se agrega L mayuscula para no confundir con 1(UNO). Convierte la litera de tipo INT a tipo LONG
        System.out.println("Valor int:" + numeroInt);
        System.out.println("Valor int sobrepasado:" + numero2Int);

        //Long
        System.out.println("Valor minimo de long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo de long:" + Long.MAX_VALUE);
        long numeroLong = 9223372036854775807L;
        long numero2Long = (long) 9223372036854775808D;
        System.out.println("Valor long:" + numeroLong);
        System.out.println("Valor long sobrepasado:" + numero2Long);

    }
}
