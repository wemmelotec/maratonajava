package br.com.abc.javacore.Lexception;

/*
Como se trata de um erro, não existe um tratamento que a JVM não tenha criado ainda e isso fará meu programa parar de funcionar
Error não é filha da classe Exception
 */
public class ErrorTest {
    public static void main(String[] args) {
        causandoUmErro();
    }
    //causando um StackOverflowError
    public static void causandoUmErro(){
        causandoUmErro();
        //esse é um erro causado pela recursividade
    }
}
