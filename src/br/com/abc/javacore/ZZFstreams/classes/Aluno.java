package br.com.abc.javacore.ZZFstreams.classes;

import java.util.List;

import static java.util.Arrays.asList;

public class Aluno {
    private String nome;
    private String matricula;
    private int nota;

    public Aluno(String nome, String matricula, int nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public static List<Aluno> bancoDeAlunos(){
        return asList(
                new Aluno("welligton", "123",8),
                new Aluno("silvana", "3231",5),
                new Aluno("gustavo", "598",10),
                new Aluno("laura", "987",3)
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
