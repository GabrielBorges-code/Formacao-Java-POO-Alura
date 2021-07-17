package sintaxeVariaveisEFluxo;

/**
 *
 * @author gabri
 */
public class TestaCaracter {
    public static void main (String [] args){
        System.out.println("Caracter");
        
        //Executa Apenas um único Item, se usa aspas simples
        char letra = 'A';
        
        System.out.println(letra);        
        
        char letra2 = 66;
        
        System.out.println(letra2);
        
        char letra3 = (char)(letra2 + 1);
        
        System.out.println(letra3);
        
        String frase = "Olá pessoas!";
        
        System.out.println(frase);
        
        String frase2 = ", vocês estão bem?";
        
        System.out.println(frase + frase2);
    }
}
