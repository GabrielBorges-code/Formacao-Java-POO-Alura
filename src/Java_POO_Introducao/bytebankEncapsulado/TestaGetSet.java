package Java_POO_Introducao.bytebankEncapsulado;

public class TestaGetSet {

    public static void main(String[] args) {
        Conta conta = new Conta(546, 123321);

        //conta.setNumero(123321);
        //conta.setAgencia(546);
        conta.deposita(36);

        System.out.println("Número da conta " + conta.getNumero());
        System.out.println("Número da conta " + conta.getAgencia());
        System.out.println("Número da conta " + conta.getAgencia());

        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel B.");
        conta.setTitular(gabriel);

        System.out.println("Titular " + conta.getTitular().getNome());
        //System.out.println("Titular " + gabriel.getNome());

        conta.getTitular().setProfissao("Programador");

        System.out.println("Profissao " + conta.getTitular().getProfissao());

        conta.deposita(100);

        System.out.println("Saldo R$ " + conta.getSaldo());

        conta.saca(140);

        System.out.println("Saldo R$ " + conta.getSaldo());





    }
}
