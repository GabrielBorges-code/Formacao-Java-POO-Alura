package Java_Util.ArrayList;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Cliente;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste_2 {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Contas");

        for (Conta contasArray : lista) {
            System.out.println(contasArray);
        }

        System.out.println("**************************");
        NumeroDaContaComparator comparador = new NumeroDaContaComparator();

        lista.sort(comparador);

        for (Conta contasArray : lista) {
            System.out.println(contasArray);
        }

    }
}

