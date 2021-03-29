package br.com.abc.javacore.crud.crud2.classes;

import java.util.Objects;

public class Estado implements Comparable<Estado> {
    private String nome;
    private String capital;

    public Estado(String nome, String capital) {
        this.nome = nome;
        this.capital = capital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Estado {" +
                "nome ='" + nome + '\'' +
                ", capital ='" + capital + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(nome, estado.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(Estado outroEstado) {
        return this.nome.compareTo(outroEstado.getNome());
    }
}
