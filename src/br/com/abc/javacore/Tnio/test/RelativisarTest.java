package br.com.abc.javacore.Tnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
relativisar é quando você tem dois paths e precisar descobrir o que tem em comum naqueles dois paths
 */
public class RelativisarTest {
    public static void main(String[] args) {
        Path dir = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\wellington");
        Path classe = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\wellington\\java\\Pessoa.java");
        //o que eu preciso saber é, a partir do primeiro caminho como eu chego na classe Pessoa
        Path pathToClasse = dir.relativize(classe);
        System.out.println(pathToClasse);
    }
}
