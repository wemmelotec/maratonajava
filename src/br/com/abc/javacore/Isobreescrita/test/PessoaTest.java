package br.com.abc.javacore.Isobreescrita.test;

import br.com.abc.javacore.Isobreescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("joaquina");
        p.setIdade(300);

        System.out.println(p);
    }
}
