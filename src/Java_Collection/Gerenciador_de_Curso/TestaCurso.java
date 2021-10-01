package Java_Collection.Gerenciador_de_Curso;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 15));
        javaColecoes.adiciona(new Aula("Modelando coleçoes", 30));

        System.out.println(javaColecoes.getAulas());



    }

}
