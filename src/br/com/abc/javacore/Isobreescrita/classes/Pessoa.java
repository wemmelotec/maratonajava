package br.com.abc.javacore.Isobreescrita.classes;

public class Pessoa {
    private String nome;
    private int idade;

    //sobreescrevendo o m�todo toString que � herdado da classe object
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
