package Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.teste;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaPoupanca;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteConta {

    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente contaCorrente = new ContaCorrente(054, 123);
        contaCorrente.deposita(150);

        ContaPoupanca contaPoupanca = new ContaPoupanca(054, 321);
        contaPoupanca.deposita(40);

        contaCorrente.transfere(60, contaCorrente, contaPoupanca);

        System.out.println("Saldo C. Corrente: " + contaCorrente.getSaldo());

        System.out.println("Saldo C. Poupança:  " + contaPoupanca.getSaldo());



    }
}
