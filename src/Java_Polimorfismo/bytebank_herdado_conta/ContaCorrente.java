package Java_Polimorfismo.bytebank_herdado_conta;

public class ContaCorrente extends Conta {

    //ao herda de uma classe mãe não se herda os contrutores, apenas atributos e métodos
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);

    }

}
