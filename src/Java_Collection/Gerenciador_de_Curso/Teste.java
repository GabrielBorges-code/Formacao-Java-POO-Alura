package Java_Collection.Gerenciador_de_Curso;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de Lista";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos Sets";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(1);

        System.out.println(aulas);

        System.out.println("--------------------------------");

        for (String arrayAula : aulas) {
            System.out.println("Aulas: " + arrayAula);
        }

        System.out.println("--------------------------------");

        String primeiraAula = aulas.get(1);

        System.out.println("1ª aula: " + primeiraAula);

        for(int i = 0; i < aulas.size(); i++){
            System.out.println(i + " - " + aulas.get(i));
        }

        System.out.println("--------------------------------");

        //Lambda Expression
        aulas.forEach(aula-> {
            System.out.println("Pecorrendo " + aula);
        });

        System.out.println("--------------------------------");
        aulas.add("Aumentando nosso conhecimento");

        System.out.println("Sem ordenação\n" +aulas);

        Collections.sort(aulas);

        System.out.println("Ordenando com Collection\n" + aulas);


    }
}
