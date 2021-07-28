package Java_Polimorfismo.bytebank_herdado_conta;

public class ContaCorrente extends Conta {

    //ao herda de uma classe mãe não se herda os contrutores, apenas atributos e métodos
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);

    }

    //Sobreescrevendo o metodo saca da classe Conta, o @Override é uma anotação e garante que estou sobreescrevendo um método e não criando um novo
    @Override
    public double saca(double valor) {
        double valorSacar = valor + 0.2;
        return super.saca(valorSacar);
    }
}
