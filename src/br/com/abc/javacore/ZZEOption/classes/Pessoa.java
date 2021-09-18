package br.com.abc.javacore.ZZEOption.classes;

import br.com.abc.javacore.ZZEOption.classes.Carro;

import java.util.Optional;

public class Pessoa {
    //essa classe vai ter um relacionamento com a classe carro
    private Carro carro;
    private String nome;

    public Pessoa(Carro carro, String nome) {
        this.carro = carro;
        this.nome = nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
    //como, nem sempre uma pessoa pode ter carro, eu faço um optional aqui
    public Optional<Carro> getCarro() {
        return Optional.ofNullable(carro);
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
