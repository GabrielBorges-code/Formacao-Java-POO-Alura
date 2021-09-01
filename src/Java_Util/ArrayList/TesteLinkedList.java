package Java_Util.ArrayList;

import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.Conta;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {
        LinkedList<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc_2 = new ContaCorrente(11, 22);
        lista.add(cc_2);

        Conta cc_3 = new ContaCorrente(22, 11);
        lista.add(cc_3);

        Conta cc_4 = new ContaCorrente(11, 22);
        lista.add(cc_4);

        System.out.println("Tamanho do array list "  + lista.size());

        Conta ref = lista.get(0);

        System.out.println("Array na posição, Agência: " + ref.getAgencia());

        lista.remove(0);

        System.out.println("Tamanho do array list "  + lista.size());

        for ( Conta referencia : lista) {
            System.out.println(referencia);
        }

    }




}
