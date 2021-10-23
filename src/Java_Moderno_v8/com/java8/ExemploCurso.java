package Java_Moderno_v8.com.java8;

import java.util.*;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "[Curso " + this.nome + ", aluno " + this.alunos + "]";
    }
}

public class ExemploCurso {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        System.out.println(cursos);
        System.out.println("--------");

        System.out.println("----Exercicio ----");
        int mediaAlunos1 = cursos.stream()
                //.filter(c -> c.getAlunos() >= 45)
                .mapToInt(Curso::getAlunos)
                .sum() / 4;

        System.out.println("Média de alunos 1 " + mediaAlunos1);

        System.out.println("----Exercicio Jeito certo----");

        OptionalDouble mediaAlunos2 = cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average();

        System.out.println("Média de alunos 2 " + mediaAlunos2.getAsDouble());

        System.out.println("--------");
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.forEach(System.out::println);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 50)
                //.forEach(c -> System.out.println(c));
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        System.out.println("--------");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 50)
                .forEach(c -> System.out.println(c));

        System.out.println("--------");
        cursos.stream()
                .filter(c -> c.getAlunos() >= 150)
                .findAny()
                .ifPresent(c -> System.out.println(c));

        System.out.println("--------");
        cursos = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList());

        cursos.forEach(System.out::println);


    }

}
