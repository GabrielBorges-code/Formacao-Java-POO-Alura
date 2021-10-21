package Java_Collection.Gerenciador_de_Curso;

import java.util.*;

public class Curso {

    private String nome;
    private String nomeInstrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

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

    public int getTempoTotal(){
        /**int tempoTotal = 0;

        for (Aula aula : aulas){
            tempoTotal += aula.getTempo();
        }*/

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + nome +  ", tempo total: " + this.getTempoTotal() +
                ", aulas: " + this.aulas + "]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);

    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
