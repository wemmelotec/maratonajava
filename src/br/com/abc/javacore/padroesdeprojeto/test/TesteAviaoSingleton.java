package br.com.abc.javacore.padroesdeprojeto.test;

import br.com.abc.javacore.padroesdeprojeto.classes.Aviao;
import br.com.abc.javacore.padroesdeprojeto.classes.AviaoSingleton;

public class TesteAviaoSingleton {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }

    private static void agendarAssento(String assento) {
        //essa linha é uma forma de criar um objeto que tem um construtor privado
        AviaoSingleton a = AviaoSingleton.getINSTANCE();
        System.out.println(a.bookAssento(assento));
    }
}
