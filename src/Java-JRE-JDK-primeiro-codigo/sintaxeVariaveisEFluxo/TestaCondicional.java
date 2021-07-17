/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxeVariaveisEFluxo;

/**
 *
 * @author gabri
 */
public class TestaCondicional {

    public static void main(String[] args) {

        int idade = 23;
        int quantidade = 60;
        if (idade > 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        
        if (quantidade > 94){
            System.out.println("Não pode entrar");
        }else if (quantidade > 50){
            System.out.println("Lotação Média");
        }else{
            System.out.println("Pode entrar");
        }

    }

}
