package Java_Polimorfismo.bytebank_herdado_conta;

public class TesteConta {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(054, 123);
        contaCorrente.deposita(150);

        ContaPoupanca contaPoupanca = new ContaPoupanca(054, 321);
        contaPoupanca.deposita(40);

        contaCorrente.transfere(60, contaCorrente, contaPoupanca);

        System.out.println("Saldo C. Corrente: " + contaCorrente.getSaldo());

        System.out.println("Saldo C. Poupança:  " + contaPoupanca.getSaldo());



    }
}