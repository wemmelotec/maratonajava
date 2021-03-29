package br.com.abc.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
Classe responsável por juntar dois paths, ou resolver path
 */
public class ResolvendoPath {
    public static void main(String[] args) {
        //esse diretório e esse arquivo não existem de fato, apenas com esses comando abaixo.
        //mas eu posso trabalhar com eles hipoteticamente
        Path dir = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\wellington");
        Path arquivo = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\wellington\\arquivo.txt");
        //farei a junção na variável result
        Path result = dir.resolve(arquivo);
        System.out.println(result);
    }
}
