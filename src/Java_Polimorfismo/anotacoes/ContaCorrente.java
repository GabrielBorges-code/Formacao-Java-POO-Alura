package Java_Polimorfismo.anotacoes;

import Java_Polimorfismo.bytebank_exercicio.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int numeroConta, int numeroAgencia) {
        super(numeroConta, numeroAgencia);
        System.out.println("Conta do tipo Corrente");
        System.out.println("---------------------------");
    }

    //Overrider
    @Override
    public void transfereDinheiro(double valor, Conta origem, Conta destino) {
        valor += 5;
        if(origem.getSaldoConta() > valor){
            origem.sacaDinheiro(valor);
            destino.depositaDinheiro(valor-5);
            System.out.println("Saque efetuado com sucesso.");
        }
    }


    @Override
    public void calcularTributosDoValor(double valor) {
        super.sacaDinheiro(valor);
    }
}
