package Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.ContaEspecial;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;

public class ContaEspecial extends Conta {



    public ContaEspecial(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {

    }
}
