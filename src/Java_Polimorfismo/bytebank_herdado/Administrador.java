package Java_Polimorfismo.bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticado;

    public Administrador() {
        this.autenticado = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
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
