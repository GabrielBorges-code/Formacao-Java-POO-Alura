package Java_POO_Introducao.bytebankEncapsulado;

public class TestaValores {

    public static void main(String[] args) {

        Conta conta = new Conta(357, 45698);

        //A conta está incosistente de acordo com a regra de negócio não com a programção
        //conta.setAgencia(-50);
       // conta.setNumero(-35);

        System.out.println("Agência Nº" + conta.getAgencia());
        System.out.println("Conta Nº " + conta.getNumero());
        Conta conta2 = new Conta(357, 123698);

        System.out.println("Total de contas criadas " + Conta.getTotalDeObj());



    }



}
