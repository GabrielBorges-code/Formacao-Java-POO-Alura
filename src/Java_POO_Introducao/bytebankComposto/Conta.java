package Java_POO_Introducao.bytebankComposto;

public class Conta {

    //Variaveis na classe pode ser entendida como atributos
    private double saldo;
    int agencia = 42;
    int numero;
    //Referencia ao objeto Cliente (Associando Conta ao cliente)
    Cliente titular;

    //metodo é uma ação, parecida com uma function. métodos voids não retorna nenhum valor
    public void deposita(double valor){
        //this serve para referênciar o atributo da classe
        this.saldo += valor;
    }

    public double saca(double valor){
        if(this.saldo >= valor){
            return this.saldo -=  valor;

        }else{
            return 0;
        }
    }

    //Recebendo referência no me´tdo
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

}
