package br.com.abc.javacore.Tnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
classe do new IO, a partir do Java 7 é uma forma de trabalhar com entrada e saida de arquivos em subtituição a classe File
 */
public class CriandoPathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\Arquivo.txt");
        Path p2 = Paths.get("E:","intellij","maratona-java","src","br","com","abc","javacore","nio","Arquivo2.txt");

        //criar um diretório
        Path path1 = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\folder");
        //criar um arquivo
        Path arquivo = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\folder\\teste.txt");
        try {
            if (Files.notExists(path1)){
                Files.createDirectory(path1);
            }
            Files.createFile(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
