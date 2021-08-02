package br.com.abc.javacore.Gassociacao.atividade.classes;

public class Seminario {

    private String titulo;
    private Aluno [] alunos;
    private Professor professor;
    private Local localidade;

    public Local getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Local localidade) {
        this.localidade = localidade;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
