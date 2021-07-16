package sintaxeVariaveisEFluxo;

/**
 *
 * @author gabri
 */
public class TesteConversao {
    public static void main(String[] args) {
        System.out.println("Vamos converter ");
        
        double salario = 1125.50;
        System.out.println("salario " + salario);
        
        // convertendo o val0or para inteiro, essa função é chamada de casting 
        int valor = (int)salario;
        
        System.out.println("Convertando " + valor);
        
        // resultaod
        double val1 = 0.1;
        double val2 = 0.2;
        
        double total = val1 + val2;
        
        System.out.println("soma " + total);

    }
           
}
