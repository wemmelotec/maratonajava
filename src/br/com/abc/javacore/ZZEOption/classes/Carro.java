package br.com.abc.javacore.ZZEOption.classes;

import br.com.abc.javacore.ZZEOption.classes2.Pessoa;

import java.util.Optional;

public class Carro {
    //nosso carro se relaciona com uma seguradora
    private Seguradora seguradora;
    private String nome;

    public Carro(Seguradora seguradora, String nome) {
        this.seguradora = seguradora;
        this.nome = nome;
    }

    public Carro(String nome) {
        this.nome = nome;
    }
    //Como nem todo carro vai ter uma seguradora eu utilizo o optional
    public Optional<Seguradora> getSeguradora() {
        return Optional.ofNullable(seguradora);
    }

    public void setSeguradora(Seguradora seguradora) {
        this.seguradora = seguradora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
