package Java_Polimorfismo.bytebank_herdado;

public class Funcionario {

    private String nome;
    private String cpf;
    //protected, público para os classes filhos
    //protected double salario;
    private double salario;


    //posso criar um método mesmo não existindo  o atributo
    public double getBonificacao(){
        return this.salario * 0.05;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
