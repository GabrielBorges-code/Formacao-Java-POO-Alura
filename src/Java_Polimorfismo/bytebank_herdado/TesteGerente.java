package Java_Polimorfismo.bytebank_herdado;

public class TesteGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Angela S.");
        g1.setCpf("44.444.44");
        g1.setSalario(6500);

        System.out.println(g1.getNome() + " " +  g1.getCpf() + " " + g1.getSalario());

        g1.setSenha(654);

        boolean autenticacao = g1.autentica(640);

        System.out.println("Senha " + autenticacao);
    }
}
