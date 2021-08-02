package br.com.abc.javacore.Tnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
é a classe mais simples para buscar arquivos em um determinado diretorio
 */
public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path dir = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\folder");
        //como trabalharei com stream e eu sei que a classe implementa o closeable eu posso utilizar o try with resouces
        //a classe é a directorystream
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) { //isso funciona como um array de path
            for (Path path: stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
