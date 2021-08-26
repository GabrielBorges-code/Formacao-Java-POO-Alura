package Java_Util;


import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaCorrente;
import Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo.ContaPoupanca;

public class TesteArrayPrimitivo {

    public static void main(String[] args) {

        ContaCorrente [] contas = new ContaCorrente[5];

        ContaCorrente CC1 = new ContaCorrente(365, 895);
        ContaCorrente CC2 = new ContaCorrente(156, 941);

        contas[0] = CC1;
        contas[1] = CC2;

        ContaCorrente referencia = CC2;

        //System.out.println(contas[0].getAgencia() + "\n" + contas[1].getAgencia());

        //É a mesma coisa
        System.out.println(contas[1].getAgencia());
        System.out.println(referencia.getAgencia());

        //forma litereal de escrever um array
        int[] refs = {1,2,3,4,5};

        System.out.println(refs.length);

        //exemplo exercicio

        /*ContaPoupanca[] contas_2 = new ContaPoupanca[10];
        ContaPoupanca cp1 = new ContaPoupanca(11,22);
        ContaPoupanca cp2 = new ContaPoupanca(33,44);

        contas_2[0] = cp1;
        contas_2[4] = cp2;*/

        //System.out.println(contas[1].getNumero());

    }
}
