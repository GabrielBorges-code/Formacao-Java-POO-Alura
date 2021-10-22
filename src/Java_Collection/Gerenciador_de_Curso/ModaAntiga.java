package Java_Collection.Gerenciador_de_Curso;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ModaAntiga {

    public static void main(String[] args) {
        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");

        /*letras.forEach(letra -> {
            System.out.println(letra);
        });*/

        Iterator<String> iterator = letras.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
