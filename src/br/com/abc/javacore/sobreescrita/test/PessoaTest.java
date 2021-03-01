package br.com.abc.javacore.sobreescrita.test;

import br.com.abc.javacore.sobreescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("joaquina");
        p.setIdade(300);

        System.out.println(p);
    }
}
