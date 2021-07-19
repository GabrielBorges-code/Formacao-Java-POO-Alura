package Java_POO_Introducao.bytebank;

public class TestaMetodo {

    public static void main(String[] args) {
        //Geralmente a referência do objeto tem o mesmo nome da classe. Invocando método
        Conta conta = new Conta();
        Conta conta1 = new Conta();

        conta.titular = "Gabriel Borges";
        conta.agencia = 123;
        conta.saldo = 15;

        //não consigo passar esse valor para um atributo pois o metodo deposita é void
        conta.deposita(1350.5);

        System.out.println("Conta saldo " + conta.saldo);

        double valorSaque = conta.saca(500);

        System.out.println("Valor do saque R$ " + valorSaque);

        System.out.println("Saldo R$ " + conta.saldo);

       if(conta.transfere(300, conta, conta1)){
           System.out.println("Transferência realizada");
       }else{
           System.out.println("Sem saldo");
       }

        System.out.println("Saldo R$ " + conta.saldo);

        System.out.println("---------------------------------------------------------------------");

        conta1.titular = "Camila Silva";
        conta1.agencia = 321;
        conta1.saldo += 100.5;



        System.out.println(conta1.saldo);
    }
}
