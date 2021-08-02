package br.com.abc.javacore.Kinterf.classes;

public interface MyInterface {
    //As interfaces podem ter constantes que são sempre implicitamente públicas, estáticas e finais.
    String URL = "https://www.vogella.com/";

    //métodos definidos em uma interface são públicos e abstratos, por padrão
    void test();
    void write(String s);

    //Um método padrão é definido por meio da default palavra-chave no início da assinatura do método
    //esse tipo de método sempre pode ser adicionado em uma interface, sem quebrar o código de quem já utiliza a
    //interface, isso apenas a partir do java 8
    default String reserveString(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
