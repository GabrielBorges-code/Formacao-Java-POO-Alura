package Java_Polimorfismo.bytebank_exercicio;

public class TestaConta {
    public static void main(String[] args) {

        Conta conta1 = new ContaPoupanca(321, 123);
        ContaCorrente conta2 = new ContaCorrente(654, 456);

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setCpf("123456789");
        cliente1.setNome("Gabriel B.");
        cliente1.setProfissao("Desenvolvedor");

        cliente2.setCpf("654651");
        cliente2.setNome("Camilla B.");
        cliente2.setProfissao("Agente Bancaria");

        conta1.depositaDinheiro(40);
        conta2.depositaDinheiro(300);

        conta1.setTitular(cliente1);
        conta2.setTitular(cliente2);

        System.out.println("Saldo conta 1 " + conta1.getSaldoConta());
        System.out.println("Saldo conta 2 " + conta2.getSaldoConta());
        System.out.println("---------------------------");

        conta2.transfereDinheiro(5, conta2, conta1);
        conta1.depositaDinheiro(106.5);

        System.out.println("---------------------------");

        System.out.println("Titular da conta 1 " + cliente1.getNome() + "\nProfissão " + cliente1.getProfissao());
        System.out.println("---------------------------");

        System.out.println("Titular da conta 2 " + cliente2.getNome() + "\nProfissão " + cliente2.getProfissao());

        System.out.println("---------------------------");

        System.out.println("Saldo conta 1 R$ " + conta1.getSaldoConta());
        System.out.println("Saldo conta 2 R$ " + conta2.getSaldoConta());

        conta2.calcularTributosDoValor(10);

        System.out.println("---------------------------");

        System.out.println("Saldo conta 2 R$ " + conta2.getSaldoConta());

        AcaoBolsa acao = new AcaoBolsa();

        acao.setLucro(500);
        acao.calcularTributosDoValor(100);

        System.out.println(acao.getLucro());

        System.out.println("---------------------------");

    }
}
