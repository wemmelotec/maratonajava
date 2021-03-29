package br.com.abc.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\io\\Arquivo.txt");
        //esse comando acima cria o objeto e n�o o arquivo em si
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getPath());
        //verificando a �ltima vez que foi modificado e transformando em uma data utilizando o date
        System.out.println("�ltima modifica��o "+ new Date(file.lastModified()));
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            boolean existe = file.exists();
            if (existe){
                System.out.println("O arquivo foi deletado " +file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
