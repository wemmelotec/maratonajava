package br.com.abc.javacore.strings.test;

public class StringTest {
    public static void main(String[] args) {
        //primeira coisa, strings no java s�o imut�veis
        String nome = "william";
        //String sobrenome = new String(" Suane"); //observe que p intellij avisa que � redundante
        nome.concat("Suane"); //concatenou e criou outro objeto
        System.out.println(nome);//o ponteiro ainda est� apontando para o objeto william
        nome = nome.concat("Suane"); //agora sim eu coloquei o ponteiro no novo objeto
        System.out.println(nome);
        //por isso � que eu falo que as strings s�o imut�veis
    }
}
