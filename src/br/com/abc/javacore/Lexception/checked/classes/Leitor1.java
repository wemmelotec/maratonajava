package br.com.abc.javacore.Lexception.checked.classes;

public class Leitor1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 1");
    }
}
