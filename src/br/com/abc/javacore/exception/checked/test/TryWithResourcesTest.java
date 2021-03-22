package br.com.abc.javacore.exception.checked.test;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {

    }

    public static void lerArquivo() {
        try(Reader reader = new BufferedReader(new FileReader("text.txt"))) {
            //para que as classes venham no parametro elas tem que implementar o Closeable
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
