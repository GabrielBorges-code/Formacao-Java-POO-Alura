package Java_Util.ArrayList;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        /**Conta cc = new ContaCorrente(22, 11);
        Conta cc_2 = new ContaCorrente(22, 11);

        boolean saoIguais = cc.eIgual(cc_2);

        System.out.println("As contas são iguais? " + saoIguais); **/

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc_2 = new ContaCorrente(11, 22);
        lista.add(cc_2);

        Conta cc_3 = new ContaCorrente(11, 22);

        boolean existeConta = lista.contains(cc_3);

        System.out.println("A conta existe? " + existeConta);


        for ( Conta referencia : lista) {
            System.out.println(referencia);
        }

    }
}
