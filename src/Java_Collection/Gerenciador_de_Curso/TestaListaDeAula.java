package Java_Collection.Gerenciador_de_Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula aula1 = new Aula("Revisando ArrayList", 21);

        Aula aula2 = new Aula("Lista de objetos", 17);

        Aula aula3 = new Aula("Relacionamento de listas e objetos", 14);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println(aulas);

        //Essa linha e a de baixo tem o mesmo efeito
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

        //Essa linha e a de cima tem o mesmo efeito
        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

    }
}
