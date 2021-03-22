package br.com.abc.javacore.crud.classes;

import java.util.Objects;

public class Produto {
    private String name;
    private int quantidade;

    public Produto(String name, int quantidade) {
        this.name = name;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return quantidade == produto.quantidade && Objects.equals(name, produto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantidade);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
