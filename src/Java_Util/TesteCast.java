package Java_Util;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Cliente;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;

public class TesteCast {

    public static void main(String[] args) {

        int numero = 3;
        double valor = numero; //cast implícito

        int numero_1 = 3;
        double valor_1 = (double) numero_1; //cast explícito

        double valor_2 = 3.56;
        int numero_2 = (int) valor_2; //cast explicito é exigido pelo compilador

        System.out.println(valor + "\n" + valor_1 + "\n" + numero_2);

        ContaCorrente cc1 = new ContaCorrente(22, 33);
        Conta conta = cc1; //cast implicito

        ContaCorrente cc1_2 = new ContaCorrente(22, 33);
        Conta conta_2 = (Conta) cc1_2; //cast explícito mas desnecessário

        System.out.println(conta + "\n" + conta_2);

        /* Cliente cliente = new Cliente();
        Conta conta_3 = (Conta) cliente; **/ //impossível, não compila

    }

}
