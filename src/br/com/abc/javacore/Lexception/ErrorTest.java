package br.com.abc.javacore.Lexception;

/*
Como se trata de um erro, n�o existe um tratamento que a JVM n�o tenha criado ainda e isso far� meu programa parar de funcionar
Error n�o � filha da classe Exception
 */
public class ErrorTest {
    public static void main(String[] args) {
        causandoUmErro();
    }
    //causando um StackOverflowError
    public static void causandoUmErro(){
        causandoUmErro();
        //esse � um erro causado pela recursividade
    }
}
