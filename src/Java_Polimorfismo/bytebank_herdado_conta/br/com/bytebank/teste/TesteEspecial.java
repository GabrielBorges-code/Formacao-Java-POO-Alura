package Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.teste;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.ContaEspecial.ContaEspecial;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;

public class TesteEspecial extends ContaEspecial {

    public TesteEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {

    }
    public static void main(String[] args) {

        ContaEspecial CE = new ContaEspecial(546, 654);

        //CE.saldo = 15;

        System.out.println(CE.getSaldo());
    }
}
