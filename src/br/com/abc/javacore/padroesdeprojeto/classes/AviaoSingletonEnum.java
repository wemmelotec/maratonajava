package br.com.abc.javacore.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/*
Essa classe é uma atualização da AviaoSingleton, nela não preciso utilizar o synchronized pois já vem por ser um ENUM
e evita o reflexion, que é uma forma de se criar objetos mesmo em construtores privados, como na classe AviaoSingleton
 */
public enum AviaoSingletonEnum {
    INSTANCE;
    private Set<String> assentosDisponiveis;

    AviaoSingletonEnum() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }
}
