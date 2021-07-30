package Java_Polimorfismo.bytebank_herdado;

public class SistemaInterno {

    public int senha = 222;

    public void autentica(Autenticavel g){
       boolean autenticou =  g.autentica(this.senha);

       if(autenticou){
           System.out.println("Pode entrar");
       }else {
           System.out.println("Não pode entrar");
       }
    }

}
