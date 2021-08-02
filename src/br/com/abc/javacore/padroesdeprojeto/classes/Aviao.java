package br.com.abc.javacore.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/*
Essa classe deveria utilizar o padrão de projeto singleton
afim de evitar duplicação dos objetos e respectivamente de seus atributos
 */
public class Aviao {
    private Set<String> assentosDisponiveis;

    public Aviao() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    public boolean bookAssento(String assento){
        return assentosDisponiveis.remove(assento);
    }
}
