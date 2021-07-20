package Java_POO_Introducao.bytebankComposto;

public class TestaSacaValoresNegativos {

    public static void main(String[] args) {
        Conta contaGabriel = new Conta();

        contaGabriel.deposita(150);

        //Não está sendo possível acessar o saldo pois está privado o atributo saldo
        //System.out.println("Saldo R$ " + contaGabriel.saldo);
        System.out.println("Saldo R$ " + contaGabriel.getSaldo());


        //valor do saque maior que o valor em conta, logo não entrou na condição de saque.
        contaGabriel.saca(200);

        System.out.println("Saldo R$ " + contaGabriel.getSaldo());

        //burlando a validação do saca
        //contaGabriel.saldo -= 200;

        //System.out.println("Saldo R$ " + contaGabriel.saldo);

        //boa prática, é importante ao criar um programa sempre acessar as informações através dos métodos e nunca através dos atributos



    }
}
