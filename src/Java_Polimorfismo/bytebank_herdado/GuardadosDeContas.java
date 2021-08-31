package Java_Polimorfismo.bytebank_herdado;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;

public class GuardadosDeContas {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadosDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;

    }

    public void adiciona(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;

    }

    public int getQuatidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int posicao) {
        return this.referencias[posicao];



    }
}
