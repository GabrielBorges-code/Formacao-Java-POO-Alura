package Java_Polimorfismo.bytebank_herdado;

//Gerente herda da classe funcionário
public class Gerente extends Funcionario {


    private int senha;

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    //posso criar um método mesmo não existindo  o atributo
    public double getBonificacao(){
        //o super está referenciando a classe mãe, no caso a a classe funcionário
        //Através do método super é possível acessar os metodos e atributos da classe mãe
        return (super.getBonificacao()) + super.getSalario();
    }

}
