package br.com.abc.javacore.ZZBpadroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/*
Essa classe é uma melhoria da classe Aviao utilizando o padrão de projeto singleton
 */
public class AviaoSingleton {
    // Eager initialization (inicialização gulosa), ou seja, mesmo não sendo utilizada essa classe, esse objeto será instaciando, por ser estático
    // private static final AviaoSingleton INSTANCE = new AviaoSingleton();
    // E essa é a forma Lazy initializaton (inicialização preguiçosa) só será iniciado quando for ser utilizado
    private static AviaoSingleton INSTANCE;
    private Set<String> assentosDisponiveis;

    //o synchronized garante a atomicidade(threadsafe) desse método mesmo que tenha mais de uma Thread trabalhando nesse método em nosso sistema
    //assim duas Threads distintas não pegaram uma INSTANCE nula ao mesmo tempo
    public synchronized static AviaoSingleton getINSTANCE() {
        //essa verificação foi incluida por conta do lazy, sem o lazy só teria a linha de return INSTANCE
        if (INSTANCE == null) {
            INSTANCE = new AviaoSingleton();
        }
        return INSTANCE;
    }

    private AviaoSingleton() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }

    private static void agendarAssento(String assento) {
        AviaoSingletonEnum a = AviaoSingletonEnum.INSTANCE;
        System.out.println(a.bookAssento(assento));
    }
}
