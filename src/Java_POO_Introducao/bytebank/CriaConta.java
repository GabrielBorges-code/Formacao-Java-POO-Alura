package Java_POO_Introducao.bytebank;

public class CriaConta {

    public static void main(String[] args) {
        int var;

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        conta1.saldo = 200.50;
        conta2.agencia = 351684;

        conta1.saldo += 50;

        System.out.println("Primeira conta " + conta1.saldo);
        System.out.println("Segunda conta " + conta2.agencia);

        System.out.println(conta1.agencia);
        System.out.println(conta2.agencia);
        System.out.println(conta3.agencia);

        if(conta1 == conta2){
            System.out.println("São iguais, primeira conta: " + conta1 + ". Segunda coonta: " + conta2);
        }else {
            System.out.println("Contas diferentesm, primeira conta: " + conta1 + ". Segunda coonta: " + conta2);
        }





    }
}
