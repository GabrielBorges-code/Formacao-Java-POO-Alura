package Java_E_Java_lang;

import java.nio.charset.StandardCharsets;

public class Teste {

    public static void main(String[] args) {

        String nome = "Alura";

        /**String outroNome = new String("Outra Alura");

        System.out.println(outroNome);**/

        char a = 'A';

        char l = 'L';

        String nome0 = nome.replace("A", "G");

        //sobre carga de método, aspas simples para indicar apenas uma letra
        String nome3 = nome.replace(a, l);

        System.out.println(nome0);

        //System.out.println(nome.replace("alura", "Pão"));
        String nome2 = nome.toUpperCase();
        System.out.println(nome2);
        System.out.println(nome.toUpperCase());
        System.out.println(nome3);

        String nome54 = "Mario";
        nome.replace('o', 'a');
        System.out.println(nome54);

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();
        System.out.println(texto);



    }

}
