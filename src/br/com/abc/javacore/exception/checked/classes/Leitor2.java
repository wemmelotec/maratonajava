package br.com.abc.javacore.exception.checked.classes;

public class Leitor2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 2");
    }
}
