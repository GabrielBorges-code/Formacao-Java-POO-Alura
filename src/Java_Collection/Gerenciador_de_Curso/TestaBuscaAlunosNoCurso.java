package Java_Collection.Gerenciador_de_Curso;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 15));
        javaColecoes.adiciona(new Aula("Modelando coleçoes", 30));

        Aluno a1 = new Aluno("Gabriel Borges", 9814);
        Aluno a2 = new Aluno("Paulo Silveira", 5617);
        Aluno a3 = new Aluno("Maucirio Aniche", 7496);
        Aluno a4 = new Aluno("Aads Asdf", 9814);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println(javaColecoes.getAlunos());

        System.out.println("-------------");

        System.out.println("Quem é o aluno com a matrícula 9814? ");
        Aluno aluno = javaColecoes.buscaMatricula(9814);
        System.out.println("Aluno " + aluno);
    }

}
