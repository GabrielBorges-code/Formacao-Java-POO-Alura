package Java_Polimorfismo.bytebank_exercicio;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroConta, int numeroAgencia) {
        super(numeroConta, numeroAgencia);
        System.out.println("Conta do tipo Poupança");
        System.out.println("---------------------------");
    }

    @Override
    public void transfereDinheiro(double valor, Conta origem, Conta destino) {
        if(origem.getSaldoConta() > valor){
            origem.sacaDinheiro(valor);
            destino.depositaDinheiro(valor);
            System.out.println("Saque efetuado com sucesso.");
        }

    }
}
