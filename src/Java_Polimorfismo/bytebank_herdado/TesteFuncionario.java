package Java_Polimorfismo.bytebank_herdado;

public class TesteFuncionario {

    public static void main(String[] args) {
        //Não consigo mais criar um funcionário pois agora ele é um método abstrato
        //Funcionario gabriel = new Funcionario();

        Gerente gabriel = new Gerente();
        gabriel.setCpf("555.555.55");
        gabriel.setNome("Gabriel B.");
        gabriel.setSalario(1125);

        System.out.println("Nome " + gabriel.getNome());
        System.out.println("Salario R$ " + gabriel.getSalario());

        // não funciona, atributo está protegido
        //gabriel.salrio = 30;

        System.out.println("Bonificação "  + gabriel.getBonificacao());

    }
}
