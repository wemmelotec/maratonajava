package br.com.abc.javacore.ZZEOption.classes2;

public class Pessoa {
    //essa classe vai ter um relacionamento com a classe carro
    private Carro carro;
    private String nome;

    public Carro getCarro(){
        return carro;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCarro(Carro carro){
        this.carro = carro;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
