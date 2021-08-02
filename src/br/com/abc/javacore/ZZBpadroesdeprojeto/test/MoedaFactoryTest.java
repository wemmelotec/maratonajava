package br.com.abc.javacore.ZZBpadroesdeprojeto.test;

import br.com.abc.javacore.ZZBpadroesdeprojeto.classes.Moeda;
import br.com.abc.javacore.ZZBpadroesdeprojeto.classes.MoedaFactory;
import br.com.abc.javacore.ZZBpadroesdeprojeto.classes.Pais;

public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.EUA);
        System.out.println(moeda.getSimbolo());
    }
}
