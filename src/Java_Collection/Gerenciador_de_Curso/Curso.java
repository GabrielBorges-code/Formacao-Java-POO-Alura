package Java_Collection.Gerenciador_de_Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private String nome;
    private String nomeInstrutor;

    private List<Aula> aulas = new ArrayList<Aula>();

    public Curso(String nome, String nomeInstrutor) {
        this.nome = nome;
        this.nomeInstrutor = nomeInstrutor;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public String getNome() {
        return nome;
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);

    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);

    }



}
