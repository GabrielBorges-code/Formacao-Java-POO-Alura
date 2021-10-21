package Java_Collection.Gerenciador_de_Curso;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 15));
        javaColecoes.adiciona(new Aula("Modelando coleçoes", 30));

        Aluno a1 = new Aluno("Gabriel Borges", 9814);
        Aluno a2 = new Aluno("Paulo Silveira", 5617);
        Aluno a3 = new Aluno("Maucirio Aniche", 7496);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");

        javaColecoes.getAlunos().forEach(todosAlunos -> {
            System.out.println(todosAlunos);
        });

        System.out.println("O aluno " + a1 + " está matriculado: " + javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Gabriel Borges", 9814);
        System.out.println("Esse 'Gabriel' está matrículado? " + javaColecoes.estaMatriculado(turini));

        System.out.println("Esses objetos são equals? " + (turini.equals(a1)));

        System.out.println(a1.hashCode() == turini.hashCode());

    }
}
