package br.com.abc.javacore.heranca.test;

import br.com.abc.javacore.heranca.classe.Endereco;
import br.com.abc.javacore.heranca.classe.Funcionario;
import br.com.abc.javacore.heranca.classe.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco end = new Endereco("romildo","manga");
        Pessoa p = new Pessoa("Gina","xxxxx",end);
        p.imprime();
        System.out.println("****************************");
        Funcionario f = new Funcionario("augusto","yyyyyy",end,15000);
        f.imprime();
        System.out.println("****************************");

    }
}
