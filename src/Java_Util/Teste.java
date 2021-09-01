package Java_Util;

import Java_Polimorfismo.bytebank_herdado.GuardadosDeContas;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;

public class Teste {

    public static void main(String[] args) {
        GuardadosDeContas guardadosDeContas = new GuardadosDeContas();

        Conta cc = new ContaCorrente(22, 11);
        guardadosDeContas.adiciona(cc);

        Conta cc_2 = new ContaCorrente(11, 22);
        guardadosDeContas.adiciona(cc_2);
                
        int tamanho = guardadosDeContas.getQuatidadeDeElementos();

        System.out.println(tamanho);

        Conta ref = guardadosDeContas.getReferencia(0);
        Conta ref_2 = guardadosDeContas.getReferencia(1);

        System.out.println(ref.getAgencia() + "\n" + ref_2);


        //9) (Desafio) Agora experimente criar um guardador que saiba guardar qualquer tipo de referências, usando a classe Object

    }
}
