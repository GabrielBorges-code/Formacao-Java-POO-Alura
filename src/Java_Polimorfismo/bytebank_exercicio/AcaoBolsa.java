package Java_Polimorfismo.bytebank_exercicio;

public class AcaoBolsa implements Tributavel {

    private double lucro;

    @Override
    public void calcularTributosDoValor(double valor){
        this.lucro -= valor * 0.15;

    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
}
