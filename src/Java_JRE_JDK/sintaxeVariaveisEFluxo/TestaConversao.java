package Java_JRE_JDK.sintaxeVariaveisEFluxo;

/**
 *
 * @author gabri
 */
public class TestaConversao {
    public static void main(String[] args) {
        System.out.println("Vamos converter ");
        
        double salario = 1125.50;
        System.out.println("salario " + salario);
        
        // convertendo o val0or para inteiro, essa fun��o � chamada de casting 
        int valor = (int)salario;
        
        System.out.println("Convertando " + valor);
        
        // resultado 0.30000000000000004
        double val1 = 0.1;
        double val2 = 0.2;
        
        double total = val1 + val2;
        
        System.out.println("soma " + total);

    }
           
}
