package Java_Polimorfismo.bytebank_herdado;

//implements serve para implementar uma interface
public class Cliente implements Autenticavel {

    //private int senha;
    private AutenticacaoUtil autenticado;

    public Cliente() {
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
