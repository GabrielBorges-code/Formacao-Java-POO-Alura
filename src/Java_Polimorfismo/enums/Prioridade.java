package Java_Polimorfismo.enums;

public enum Prioridade {

    //Recebem valores padrão, porem posso persoaliza-los
    //MIN,NORMAL,MAX,SUPERMAX;

    MIN(1),NORMAL(3),MAX(6),SUPERMAX(10);

    private int valor;

    Prioridade(int valor){
        this.valor = valor;
    }

    //é possível criar metodos dentro dos enhums
    public int getValor(){
        return this.valor;
    }

}
