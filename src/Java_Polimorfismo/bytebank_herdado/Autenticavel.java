package Java_Polimorfismo.bytebank_herdado;

//Contrato Autenticavel, quem assina o contrato precisa implementar os métodos
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
