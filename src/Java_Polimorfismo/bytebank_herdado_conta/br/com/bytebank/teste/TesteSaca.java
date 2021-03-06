package Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.teste;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(159, 321);

        conta.deposita(150);
        try {

            conta.saca(160);
        } catch (SaldoInsuficienteException ex){
            System.out.println("Saldo Isuficiente, \n" + ex.getMessage());
        }

        System.out.println("Saldo conta " +  conta.getSaldo());


    }




}
