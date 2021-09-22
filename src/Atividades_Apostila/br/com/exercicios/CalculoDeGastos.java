package Atividades_Apostila.br.com.exercicios;

public class CalculoDeGastos {

    public static void main(String[] args) {

        float mes_1 = 15000;
        float mes_2 = 23000;
        float mes_3 = 17000;
        float gastoTotal = mes_1 + mes_2 + mes_3;
        float mediaGastoTrimestre = gastoTotal / 3;

        System.out.println("Gasto mensal Janeiro " + mes_1 +
                            "\nFevereiro " + mes_2 +
                            "\nMarço " + mes_3 +
                            "\nTotal de Gastos " + gastoTotal +
                            "\nMeida de gastos no trimestre " + mediaGastoTrimestre );

    }
}
