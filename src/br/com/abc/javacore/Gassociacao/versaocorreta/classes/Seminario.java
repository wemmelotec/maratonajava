package br.com.abc.javacore.Gassociacao.versaocorreta.classes;

public class Seminario {
    private String titulo;

    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void print() {
        System.out.println("----------Relatorio do seminario-----------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor: " + this.professor.getNome());
        if (this.local != null) {
            System.out.println("Bairro: " + this.local.getBairro() + " Rua: " + this.local.getRua());
        } else System.out.println("Nenhum local cadastrado para esse seminario");
        if (alunos != null && alunos.length != 0) {
            System.out.println("Alunos participantes");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");
    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
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
