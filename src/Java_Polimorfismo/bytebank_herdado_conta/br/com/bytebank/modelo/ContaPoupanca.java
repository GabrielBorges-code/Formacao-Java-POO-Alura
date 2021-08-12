package Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);

    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }


}
