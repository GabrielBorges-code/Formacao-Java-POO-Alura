package Java_Polimorfismo.bytebank_herdado_conta;

public class ContaCorrente extends Conta {

    //ao herda de uma classe mãe não se herda os contrutores, apenas atributos e métodos
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);

    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    //Sobreescrevendo o metodo saca da classe Conta, o @Override é uma anotação e garante que estou sobreescrevendo um método e não criando um novo
    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        double valorSacar = valor + 0.2;
        super.saca(valorSacar);
    }
}
