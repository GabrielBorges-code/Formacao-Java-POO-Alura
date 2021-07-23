package Java_Polimorfismo.bytebank_herdado;

public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario gabriel = new Funcionario();

        gabriel.setCpf("555.555.55");
        gabriel.setNome("Gabriel B.");
        gabriel.setSalario(1125);

        System.out.println("Nome " + gabriel.getNome());
        System.out.println("Salario R$ " + gabriel.getSalario());

    }
}
