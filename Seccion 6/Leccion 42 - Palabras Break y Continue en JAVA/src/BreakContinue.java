
public class BreakContinue {

    public static void main(String args[]) {

        for (int i = 0; i < 3; i++) {

            if (i % 2 != 0) {

                continue;//se saltea la ejecucion y se mueve a la siguiente iteracion

            }

            System.out.println("i = " + i);

        }

//        for (int i = 0; i < 3; i++) {
//            
//            if ( i % 2 == 0){
//                
//                System.out.println("i = " + i);
//                break;
//                
//            }
//            
//        }
    }
}
