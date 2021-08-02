package br.com.abc.javacore.padroesdeprojeto.test;

import br.com.abc.javacore.padroesdeprojeto.classes.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        //com o padrão de criação builder ficar mais fácil de visualizar os argumentos que estão sendo passados
        Pessoa p1 = new Pessoa.PessoaBuilder()
                .nome("wellington")
                .apelido("melo")
                .build();
    }
}
