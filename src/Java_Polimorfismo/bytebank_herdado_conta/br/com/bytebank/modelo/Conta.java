package Java_Polimorfismo.bytebank_herdado_conta.br.com.bytebank.modelo;

 public abstract class Conta extends Object implements  Comparable<Conta> {

    protected double saldo;
    private int agencia = 42;
    private int numero;

    private Cliente titular;

    private static int totalDeObj;

    public Conta(int agencia, int numero) {
        //System.out.println("----------------------------------------------------------------");
        totalDeObj++;

        this.saldo = 0;
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Conta Crida");
        //System.out.println("Agência Nº " + this.agencia + " Conta Nº " + this.numero);
        //System.out.println("----------------------------------------------------------------");

    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor){
           throw new SaldoInsuficienteException("Saldo Insuficiente R$ " + this.saldo + ", Valor R$ " + valor);
        }
        this.saldo -=  valor;

    }

   public void transfere(double valor, Conta origem, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        origem.saca(valor);
        destino.deposita(valor);

        /*if(origem.saldo >= valor){
            origem.saca(valor);
            destino.deposita(valor);
            return true;
        }
        return false;**/

   }

   public double getSaldo(){
        return this.saldo;
   }

   public int getNumero(){
        return this.numero;
   }

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
        return Conta.totalDeObj;
    }

    @Override
    public boolean equals(Object ref) {
        Conta outraConta = (Conta) ref;

        if(this.agencia != outraConta.agencia) {
            return false;
        }
        if(this.numero != outraConta.numero) {
            return false;
        }

        return true;
     }

     @Override
     public int compareTo(Conta outra) {

        return Double.compare(this.saldo, outra.saldo);
     }

     @Override
     public String toString(){
        return "Numero: " + this.numero + " Agência: " + this.agencia + " Saldo R$ " + this.saldo;
     }
 }
