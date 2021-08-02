package br.com.abc.javacore.Tnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/*
getTime na Calendar retorna um Date
getTime na Date retorna um long
 */
public class AtributosBasicosTest {
    public static void main(String[] args) throws IOException {
        //essas duas linhas abaixo, implementei para organizar a data com a máscara
        String mascara = "'João Pessoa,' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        //pacote antigo
        Date primeiroDeDezembro = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();
        File file = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\folder\\arquivo.txt");
        file.createNewFile();
        file.setLastModified(primeiroDeDezembro.getTime());
        System.out.println(formatador.format(file.lastModified()));
        file.delete();
        //novo pacote
        Path path = Paths.get("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\nio\\folder\\arquivo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
        Files.setLastModifiedTime(path,fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);
    }
}
