package Java_POO_Introducao.bytebankComposto;

public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();

        //saldo não está sendo mais acessível pois está privado
        //contaDaMarcela.saldo += 15;

        //System.out.println("Saldo R$ " + contaDaMarcela.saldo);

        contaDaMarcela.titular = new Cliente();

        contaDaMarcela.titular.nome = "Marcela";

        System.out.println("Nome do(a) cliente " + contaDaMarcela.titular.nome);

        // não existe objeto dentro de objeto, apenas refer~encia a outros objetos
    }
}
