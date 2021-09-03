package Java_Util.ArrayList;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Cliente;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("Contas");

        //Em lambdas se usa ->
        /*lista.sort((Conta c1, Conta c2) -> {
            return Integer.compare(c1.getNumero(), c2.getNumero());
        });*/
        //são coisas iguais o de cima e o de baixo
        lista.sort(
                (c1, c2) ->  Integer.compare(c1.getNumero(), c2.getNumero()
        ));

        Comparator<Conta> camp = (Conta c1, Conta c2) -> {
            String nomeC1 = c1.getTitular().getNome();
            String nomeC2 = c2.getTitular().getNome();

            return nomeC1.compareTo(nomeC2);
        };

        lista.forEach((Conta contasArray) -> {
            System.out.println(contasArray + ", " + contasArray.getTitular().getNome());
        });

        System.out.println("***** Lambda em cima e foreach normal em baixo *****");

        for (Conta contasArray : lista) {
            System.out.println(contasArray + ", " + contasArray.getTitular().getNome());
        }

    }
}


