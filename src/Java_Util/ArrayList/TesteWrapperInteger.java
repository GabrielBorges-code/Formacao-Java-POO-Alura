package Java_Util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        System.out.println("-------------------");

        System.out.println("Valor mínimo " + Integer.MIN_VALUE);
        System.out.println("Valor máximo " + Integer.MAX_VALUE);

        System.out.println("Tamanho em bytes " + Integer.BYTES);
        System.out.println("Tamanho em bits " + Integer.SIZE);

        System.out.println("-------------------");

        int idade = 29;

        Integer idadeRef = Integer.valueOf(idade); //autoboxing
        int valor = idadeRef.intValue(); //unboxing

        System.out.println(idadeRef.floatValue());

        List numeros = new ArrayList();

        //NO run configuration estou definindo o valor 12 nos argumentos
        String s = args[0];

        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        /*
        * tipos primitivos ---- Wrappers
         * (8 byte) double ---- java.lang.Double
        * (4 byte) float ---- java.lang.Float
         * (8 byte) long ---- java.lang.Long
         * (5 byte) int ---- java.lang.Integer
         * (2 byte) short ---- java.lang.Short
         * (1 byte) byte ---- java.lang.Byte
         * (2 byte) char ---- java.lang.Character
         * boolean ---- java.lang.Boolean
         * */
    }
}
