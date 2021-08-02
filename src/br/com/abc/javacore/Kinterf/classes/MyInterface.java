package br.com.abc.javacore.Kinterf.classes;

public interface MyInterface {
    //As interfaces podem ter constantes que s�o sempre implicitamente p�blicas, est�ticas e finais.
    String URL = "https://www.vogella.com/";

    //m�todos definidos em uma interface s�o p�blicos e abstratos, por padr�o
    void test();
    void write(String s);

    //Um m�todo padr�o � definido por meio da default palavra-chave no in�cio da assinatura do m�todo
    //esse tipo de m�todo sempre pode ser adicionado em uma interface, sem quebrar o c�digo de quem j� utiliza a
    //interface, isso apenas a partir do java 8
    default String reserveString(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
