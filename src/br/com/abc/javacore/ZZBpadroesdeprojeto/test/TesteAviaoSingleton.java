package br.com.abc.javacore.ZZBpadroesdeprojeto.test;

import br.com.abc.javacore.ZZBpadroesdeprojeto.classes.AviaoSingleton;

public class TesteAviaoSingleton {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }

    private static void agendarAssento(String assento) {
        //essa linha � uma forma de criar um objeto que tem um construtor privado
        AviaoSingleton a = AviaoSingleton.getINSTANCE();
        System.out.println(a.bookAssento(assento));
    }
}
