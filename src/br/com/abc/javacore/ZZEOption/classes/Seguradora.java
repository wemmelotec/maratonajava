package br.com.abc.javacore.ZZEOption.classes;

import java.util.Optional;

public class Seguradora {
    private String nome;

    public Seguradora(String nome) {
        this.nome = nome;
    }

    public Seguradora() {
    }

    //Como esse nome pode ir nulo ou n�o, fa�a as seguinte mudan�as
//    public Optional<String> getNome(){
//        return Optional.ofNullable(nome);
//    }
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Seguradora{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
