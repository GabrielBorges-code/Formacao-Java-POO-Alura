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
public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 18;
        int quantidadePessoas = 3;
        // boolean acompanhado = true;

        boolean acompanhado = quantidadePessoas > 2;

        System.out.println(acompanhado);

        if (idade >= 18 && acompanhado) {

            System.out.println("Seja bem vindo");

        } else {

            System.out.println("infelizmente voce nao pode entrar");

        }

    }
}
