package Java_Util;

import Java_Polimorfismo.bytebank_herdado.GuardadosDeContas;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;

public class Exercicio {

    public static void main (String [] args) {

        //9) (Desafio) Agora experimente criar um guardador que saiba guardar qualquer tipo de referências, usando a classe Object
        //Resolvido sozinho por mim

        System.out.println("Guardando qualquer tipo de objeto");
        GuardaQualquerTIpo guardarInfo = new GuardaQualquerTIpo();

        Conta cc = new ContaCorrente(22, 11);
        guardarInfo.adicionaElmento(cc);

        Conta cc_2 = new ContaCorrente(11, 22);
        guardarInfo.adicionaElmento(cc_2);

        String frase = "Meu nome é Gabriel e tenho 23 anos de idade";
        guardarInfo.adicionaElmento(frase);

        Integer numero = 461965126;
        guardarInfo.adicionaElmento(numero);

        System.out.println("Quantidade de elementos salvos " + guardarInfo.getQtdElementos());

        System.out.println("Elemento na posição " + guardarInfo.getElementoNaPosicao(3));


    }
}
