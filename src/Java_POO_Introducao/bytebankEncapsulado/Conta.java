package Java_POO_Introducao.bytebankEncapsulado;

public class Conta {

    //o ideal é trabalhar com os atributos privados
    private double saldo;
    private int agencia = 42;
    private int numero;
    //Referencia ao objeto Cliente (Associando Conta ao cliente). Isso se chama composição
    private Cliente titular;
    //Static é um atributo da classe e não de um objeto criado
    private static int totalDeObj;
    //Construtor
    public Conta(int agencia, int numero) {
        System.out.println("----------------------------------------------------------------");
        totalDeObj++;
        //Por ser da classe não precisa do total
        //System.out.println("Total de contas criadas " + totalDeObj);
        this.saldo = 0;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Conta Crida");
        System.out.println("Agência Nº " + this.agencia + " Conta Nº " + this.numero);
        System.out.println("----------------------------------------------------------------");

    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public double saca(double valor){
        if(this.saldo >= valor){
            return this.saldo -=  valor;

        }else{
            return 0;
        }
    }

   public boolean transfere(double valor, Conta origem, Conta destino){
        if(origem.saldo >= valor){
            origem.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;

   }

   public double getSaldo(){
        return this.saldo;
   }

   public int getNumero(){
        return this.numero;
   }

   //geralmente metódos acessores são voids
   public void setNumero(int numero){
        if(numero <= 0){
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
   }

   public int getAgencia(){
        return this.agencia;
   }

   public void setAgencia(int agencia){
        if(agencia <= 0){
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
   }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalDeObj(){
        //não existe this em static, static é um atributo da classe e não uma referência a um objeto
        return Conta.totalDeObj;
    }
}
