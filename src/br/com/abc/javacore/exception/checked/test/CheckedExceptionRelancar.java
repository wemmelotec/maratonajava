package br.com.abc.javacore.exception.checked.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionRelancar {
    public static void main(String[] args) {
        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //olhe a classe CheckedExceptionTest para entender a diferen�a.
    //aqui estou passando o problema para quem est� enviando acrescentando o throws na assinatura do m�todo
    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        System.out.println("O arquivo foi criado? " + file.createNewFile());
        System.out.println("O arquivo foi criado.");
    }
}
