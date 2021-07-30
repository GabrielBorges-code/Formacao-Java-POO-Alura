package Java_Polimorfismo.anotacoes;

import Java_Polimorfismo.bytebank_exercicio.Cliente;

public abstract class Conta {

    private int numeroConta;
    private int numeroAgencia;
    @DoublePositivo
    private double saldoConta;

    private Cliente titular;

    public static int contasCriadas;

    public Conta (int numeroConta, int numeroAgencia){
        contasCriadas++;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldoConta = 0.0;

        System.out.println("Sua conta foi aberta! \nNº Agência: " + this.numeroAgencia + "\nNº Conta: " + this.numeroConta
        + "\nSaldo R$ " + this.saldoConta);

        //System.out.println("---------------------------");

    }

    public double sacaDinheiro(double valor){
        if(this.saldoConta > valor){
            return this.saldoConta -= valor;
        }
        return 0;

    }

    public double depositaDinheiro(double valor){
        return this.saldoConta += valor;
    }

    public abstract void transfereDinheiro(double valor, Conta origem, Conta destino);

    public double getSaldoConta(){
        return this.saldoConta;
    }

    public int getNumeroAgencia(){
        return this.numeroAgencia;
    }

    public int getNumeroConta(){
        return this.numeroAgencia;
    }

    public int getContasCriadas(){
        return this.contasCriadas;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }


}
