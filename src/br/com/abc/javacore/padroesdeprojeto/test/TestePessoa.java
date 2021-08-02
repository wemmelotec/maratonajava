package br.com.abc.javacore.padroesdeprojeto.test;

import br.com.abc.javacore.padroesdeprojeto.classes.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        //com o padr�o de cria��o builder ficar mais f�cil de visualizar os argumentos que est�o sendo passados
        Pessoa p1 = new Pessoa.PessoaBuilder()
                .nome("wellington")
                .apelido("melo")
                .build();
    }
}
