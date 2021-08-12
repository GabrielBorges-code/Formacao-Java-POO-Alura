package Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException (String msg){
        super(msg);
    }
}
