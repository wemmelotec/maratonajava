package br.com.abc.javacore.Sio.test;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class FileDiretorioTest {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
        File diretorio = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\io\\folder");
        boolean mkdir = diretorio.mkdir();
        System.out.println("Diretorio criado " + rb.getString(String.valueOf(mkdir)));
        File arquivo = new File(diretorio,"arquivo.txt");
        try {
            boolean arq = arquivo.createNewFile();
            System.out.println("Arquivo criado "+ rb.getString(String.valueOf(arq)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        File arquivoNovoNome = new File(diretorio,"arquivo renomeado.txt");
        boolean arq = arquivo.renameTo(arquivoNovoNome);
        System.out.println("O arquivo foi renomeado "+ rb.getString(String.valueOf(arq)));

        buscarArquivos();
    }
    public static void buscarArquivos(){
        File file = new File("E:\\intellij\\maratona-java\\src\\br\\com\\abc\\javacore\\io\\folder");
        String[] list = file.list();
        for (String str:list) {
            System.out.println(str);
        }
    }
}
