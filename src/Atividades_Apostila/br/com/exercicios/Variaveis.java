package Atividades_Apostila.br.com.exercicios;

public class Variaveis {

    public static void main(String[] args) {
        int idade = 23;
        int idadeAnoQueVem = idade + 1;

        System.out.println("Minha Idade " + idade + "\nMinha idade ano que vem " + idadeAnoQueVem);

        double pi = 3.14;
        double x = 5 * 10;

        System.out.println("Pi " + pi + "\nX " + x);

        boolean eVerdade = idade > 25;

        System.out.println(eVerdade);

        char caracterUnico = '-';

        System.out.println(caracterUnico);

        int i = 5;
        int j = i;
        i = i + 1;
        System.out.println(i);
        System.out.println(j);

        double d = 3.1415;
        int c = (int) d;

        int a = 5;
        double b = a;

        long l = 1000;
        char n = (char) l;

        System.out.println("D: " + d + "\nC: " + c + "\nA: " + a + "\nB: " + b);
        System.out.println("L: " + l + "\nN: " + n);
    }
}
