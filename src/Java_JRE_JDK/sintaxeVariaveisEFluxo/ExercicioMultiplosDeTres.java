/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_JRE_JDK.sintaxeVariaveisEFluxo;

/**
 *
 * @author gabri
 */
public class ExercicioMultiplosDeTres {
    
    public static void main(String[] args) {
        /*for(int i = 0; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println("O n�mero " + i + " � divisivel por 3");
            }
        }*/
        
         for (int i = 3; i < 100; i += 3 ){
            System.out.println("N�meros m�ltiplos por 3 s�o, " + i);
        }
    }
           
    
}
