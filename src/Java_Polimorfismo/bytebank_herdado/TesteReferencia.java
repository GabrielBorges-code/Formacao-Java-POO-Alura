package Java_Polimorfismo.bytebank_herdado;

public class TesteReferencia {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Bruna A.");
        g1.setCpf("333.333.333.33");
        g1.setSalario(5000.5);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);

        System.out.println("Controle Bonificaçao G " + controle.getSoma());

        Funcionario f1 = new Funcionario();
        f1.setNome("Alice B");
        f1.setCpf("222.222.222.22");
        f1.setSalario(2000);
        controle.registra(f1);

        System.out.println("Controle Bonificaçao F " + controle.getSoma());

        EditorDeVideo ev1 = new EditorDeVideo();
        ev1.setNome("Arnaldo C.");
        ev1.setCpf("31655641");
        ev1.setSalario(2500);
        controle.registra(ev1);

       System.out.println("Controle Bonificaçao EV " + controle.getSoma());

        Designer d1 = new Designer();
        d1.setNome("Arnaldo C.");
        d1.setCpf("31655641");
        d1.setSalario(2000);
        controle.registra(d1);

        System.out.println("Controle Bonificaçao D1 " + controle.getSoma());




    }

}
