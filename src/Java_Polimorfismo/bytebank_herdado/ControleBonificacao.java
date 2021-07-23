package Java_Polimorfismo.bytebank_herdado;

public class ControleBonificacao {

    private double soma;

    public void registra(Gerente gerente){
        double bonificacao = gerente.getBonificacao();
        this.soma += bonificacao;
    }

    //Sobrecarga de métodos, os parametros são difirentes logo posso teer um método com o memsmo nome
    public void registra(Funcionario funcionario){
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma(){
        return this.soma;
    }


}
