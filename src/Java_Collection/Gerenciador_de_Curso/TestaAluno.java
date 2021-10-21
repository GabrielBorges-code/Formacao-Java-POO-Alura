package Java_Collection.Gerenciador_de_Curso;

import java.util.*;

public class TestaAluno {

    public static void main(String[] args) {
        //Set<String> alunos = new HashSet<>();
        Collection<String> alunos = new HashSet<>();

        alunos.add("Gabriel Borges");
        alunos.add("Rodrigo Turini");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Rennan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");

        System.out.println(alunos.size());

        boolean alunoEstaMatriculado = alunos.contains("Gabriel Borges");
        System.out.println(alunoEstaMatriculado);

        alunos.remove("Mauricio Aniche");

        System.out.println(alunos.size());

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);

        alunos.forEach(alunoLista -> {
            System.out.println(alunoLista);
        });


    }

}
