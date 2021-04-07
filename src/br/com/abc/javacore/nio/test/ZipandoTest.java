package br.com.abc.javacore.nio.test;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTest {
    public static void main(String[] args) {
        //aonde nos vamos salvar o nosso zip
        Path dirZip = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\folder");
        //aonde estão os arquivos que vão ser zipados
        Path dirFiles = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\folder\\subfolder");
        //e o zip em si, o nome o arquivo
        Path zipFile = dirZip.resolve("arquivo.zip");

        //agora vamos utilizar o output stream para zipar
        try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
        DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)) {
            for (Path path: stream) {
                //agora colocar as entradas dentro desse zip
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zip.putNextEntry(zipEntry);
                //agora fazendo a leitura de arquivo por arquivo
                FileInputStream fileInputStream =  new FileInputStream(path.toFile());
                byte[] buff = new byte[2048];
                //agora vamos escrever
                int bytesRead;
                while ((bytesRead = fileInputStream.read(buff)) > 0){
                    zip.write(buff,0,bytesRead);
                }
                zip.closeEntry();
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
