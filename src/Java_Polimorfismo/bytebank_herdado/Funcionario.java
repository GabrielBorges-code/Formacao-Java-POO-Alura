package Java_Polimorfismo.bytebank_herdado;

//Uma classe abstrata é uma classe que serve de modelo para outras classes. Ela sempre será uma superclasse genérica, e suas subclasses serão mais específicas. Além disso, ela não pode ser instanciada e pode conter ou não métodos abstratos, podendo ser implementados nas classes descendentes.
public abstract class Funcionario {

    private String nome;
    private String cpf;
    //protected, público para os classes filhos
    //protected double salario;
    private double salario;


    //posso criar um método mesmo não existindo  o atributo
    public double getBonificacao(){
        //System.out.println("Bonificação do Funcionario");
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
