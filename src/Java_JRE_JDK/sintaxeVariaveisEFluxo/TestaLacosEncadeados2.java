package Java_JRE_JDK.sintaxeVariaveisEFluxo;

/**
 *
 * @author gabri
 */
public class TestaLacosEncadeados2 {

    public static void main(String[] args) {
        // soma
        /*for(int multiplicador = 0; multiplicador <= 10; multiplicador++ ){
            System.out.println((1) + " + " + (multiplicador) + " = " + (multiplicador+1));
        }**/

        //tabuada de multiplicacao
        /*for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print("*");

            }
            System.out.println();

        }*/
        
         for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if ( coluna > linha) {
                    break;
                }
                System.out.print( coluna+1  );
            }
            System.out.println();
        }

    }

}
