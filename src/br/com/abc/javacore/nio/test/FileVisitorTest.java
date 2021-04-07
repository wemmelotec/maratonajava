package br.com.abc.javacore.nio.test;
/*
com essa classe FileVisitorTest eu consigo listar o que tem no diretorio e seus subdiretorios
com essa outra classe AcharTodosOsBkps eu identifico a extensão que eu busco
 */

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

class AcharTodosOsBkps extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        //lógica da busca
        if(file.getFileName().toString().endsWith(".bkp")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}
public class FileVisitorTest {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\folder"),
                            new AcharTodosOsBkps());
    }
}
