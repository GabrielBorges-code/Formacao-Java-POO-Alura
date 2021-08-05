package Java_Excecoes.Java_pilha;

public class FluxoComTratamento {

    //Conceito de pilha, primeiro a entrar, último a sair. Stack significa pilha
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (Exception ex) {
            System.out.println("Exception, " + ex.getMessage());
            ex.printStackTrace();

        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }

    public static void metodo2() {
        System.out.println("Inicio do metodo 2");

        //são iguais
        //ArithmeticException ex =  new ArithmeticException("Deu errado");
        //throw  new MinhaExcecao("Deu ruim cara, melhora esse código kk");



        //System.out.println("Fim do metodo 2");
    }


}
