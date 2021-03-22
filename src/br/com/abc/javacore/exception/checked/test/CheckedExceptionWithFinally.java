package br.com.abc.javacore.exception.checked.test;

public class CheckedExceptionWithFinally {
    public static void main(String[] args) {
        abrirArquivo();
    }

    public static void abrirArquivo() {
        try {
            System.out.println("O arquivo foi criado? ");
            System.out.println("Abrindo um arquivo.");
            System.out.println("Executando a leitura do arquivo.");
            throw new Exception(); //lancei uma exceção para entrar no catch
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        }finally {
            System.out.println("Fechando o arquivo");
            //o bloco finally sempre será executado, indepente se veio do try ou do catch, até mesmo se tiver um return no try
        }
    }
}