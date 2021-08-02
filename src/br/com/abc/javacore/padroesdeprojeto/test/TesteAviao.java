package br.com.abc.javacore.padroesdeprojeto.test;

import br.com.abc.javacore.padroesdeprojeto.classes.Aviao;

public class TesteAviao {
    public static void main(String[] args) {
        /*
        Dessa forma, sem utilizar o padrão de projeto singleton, eu crio um objeto ao executar a primeira linha e ao
        executar a segunda linha eu crio outro objeto, por isso, ele consegue exluir agendar a mesma cadeira duas vezes
         */
        agendarAssento("1A");
        agendarAssento("1A");
    }

    private static void agendarAssento(String assento) {
        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));
    }
}
