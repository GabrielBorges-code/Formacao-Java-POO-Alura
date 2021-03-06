package Java_Polimorfismo.bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticado;

    //posso criar um método mesmo não existindo  o atributo na classe filho
    public double getBonificacao(){

        System.out.println("Bonificação do gerente");
        return  super.getSalario();
    }

    public Gerente() {
        this.autenticado = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticado.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha) {
        boolean autenticou = this.autenticado.autentica(senha);
        return autenticou;
    }
}
