
package Java_JRE_JDK.sintaxeVariaveisEFluxo;

/**
 *
 * @author gabri
 */
public class TestaValores {
    
    public static void main(String[] args) {
        
        int primeiro = 5;
        int segundo = 7;
        
        segundo = primeiro;
        primeiro = 10;
        
        // quanto vale o segundo? 5
        
        System.out.println(primeiro + " " + segundo);
    }
    
}
