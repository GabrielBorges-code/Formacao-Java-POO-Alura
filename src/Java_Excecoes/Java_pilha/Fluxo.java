package Java_Excecoes.Java_pilha;

// import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Fluxo {

    //Conceito de pilha, primeiro a entrar, último a sair. Stack significa pilha
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException ex) {
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
        for (int i = 1; i <= 5; i ++){
            System.out.println(i);
            int a = i / 0;
            //Conta conta = null;
            //conta.deposita();


        }
        System.out.println("Fim do metodo 2");
    }


}
