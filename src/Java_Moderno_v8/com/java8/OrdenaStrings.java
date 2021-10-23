package Java_Moderno_v8.com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Alura Online");
        palavras.add("Editora Casa do Código");
        palavras.add("Caelum");

        System.out.println(palavras);

        System.out.println("---------");

        //Lambdas
        /*palavras.sort((s1, s2) -> {
            if(s1.length() < s2.length())
                return -1;
            if(s1.length() > s2.length())
                return 1;
            return 0;
        });*/

        //palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        //palavras.sort(Comparator.comparing(s -> s.length()));

        palavras.sort(Comparator.comparing(String::length));

        //Collections.sort(palavras, comparator);
        //palavras.sort(comparator);
        System.out.println(palavras);

        System.out.println("---------");

        for (String p : palavras ) {
            System.out.println(p);
        }

        System.out.println("---------");

        //Lambdas
        /*palavras.forEach(p -> {
            System.out.println(p);
        });*/

        palavras.forEach(p -> System.out.println(p));

    }

}

class CompadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;

        if(s1.length() > s2.length())
            return 1;

        return 0;
    }
}
