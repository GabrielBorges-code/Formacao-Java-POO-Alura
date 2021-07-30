package Java_Polimorfismo.enums;

public class Enums {

    public static void main(String[] args) {
        //São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista de
        // valores pré-definidos. Na linguagem de programação Java, pode ser definido um tipo de enumeração usando a palavra chave enum.

        //Thread é uma linha de execução. Pode-se se definir prioridades na linha
        /*System.out.println("Prioridade menor " + Thread.MIN_PRIORITY);
        System.out.println("Prioridade normal " + Thread.NORM_PRIORITY);
        System.out.println("Prioridade Máxima " + Thread.MAX_PRIORITY);

        Thread thread = new Thread(() -> System.out.println("Rodando..."));

        thread.setPriority(Thread.MAX_PRIORITY);

        thread.start();**/

        //Não é possivel instanciar um ENUM
        Prioridade pMin = Prioridade.MIN;
        Prioridade pNormal = Prioridade.NORMAL;
        Prioridade pMax = Prioridade.MAX;
        Prioridade pSuper = Prioridade.SUPERMAX;

        //pega os valores padrões já definidos pelos enums
        /*System.out.println(pMin.ordinal());
        System.out.println(pNormal.ordinal());
        System.out.println(pMax.ordinal());
        System.out.println(pSuper.ordinal());**/

        //Pega os valores definidos por mim
        System.out.println(pMin.getValor());
        System.out.println(pNormal.getValor());
        System.out.println(pMax.getValor());
        System.out.println(pSuper.getValor());

        //Mostra diversos estados
        //Thread.State.

    }

}
