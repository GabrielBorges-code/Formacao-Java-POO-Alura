package Java_Util;

public class GuardaQualquerTIpo {

    private Object [] guardar;
    private int posicao;

    public GuardaQualquerTIpo () {
        this.guardar =  new Object[15];
        this.posicao = 0;
    }

    public void adicionaElmento (Object ref) {
        this.guardar[this.posicao] = ref;
        this.posicao++;
    }

    public int getQtdElementos() {
        return posicao;
    }

    public Object getElementoNaPosicao(int posicao) {
        return this.guardar[posicao];
    }
}
