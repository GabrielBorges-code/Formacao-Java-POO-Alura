package Java_POO_Introducao.bytebank;

public class TesteReferencia {

    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.saldo = 300;

        System.out.println("Primeira conta saldo " + conta1.saldo);

        // Tem o mesmo endereço da memoria que o conta1. É uma refêrencia para uma conta
        Conta conta2 = conta1;

        System.out.println("Segunda conta saldo " + conta2.saldo);

        conta2.saldo += 100;

        System.out.println("Segunda conta saldo " + conta2.saldo);

        System.out.println("Primeira conta saldo " + conta1.saldo);

        if(conta1 == conta2){
            System.out.println("São iguais, primeira conta: " + conta1 + ". Segunda coonta: " + conta2);
        }else {
            System.out.println("Contas diferentes");
        }

    }
}
