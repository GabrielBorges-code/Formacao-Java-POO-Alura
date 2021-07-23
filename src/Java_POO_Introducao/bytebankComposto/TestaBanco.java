package Java_POO_Introducao.bytebankComposto;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente clienteGabriel = new Cliente();

        clienteGabriel.nome = "Gabriel Borges";
        clienteGabriel.cpf = "222.222.222.22";
        clienteGabriel.profissao = "Desenvolvedor";

        Conta contaDoGabriel = new Conta();

        contaDoGabriel.deposita(50);

        //Fazendo a associação entre cliente e conta
        contaDoGabriel.titular = clienteGabriel;

        System.out.println(contaDoGabriel.titular.nome);

        //Mesmo objeto
        System.out.println(contaDoGabriel.titular);
        System.out.println(clienteGabriel);

    }
}
