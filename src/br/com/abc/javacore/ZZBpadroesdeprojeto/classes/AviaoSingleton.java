package br.com.abc.javacore.ZZBpadroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

/*
Essa classe � uma melhoria da classe Aviao utilizando o padr�o de projeto singleton
 */
public class AviaoSingleton {
    // Eager initialization (inicializa��o gulosa), ou seja, mesmo n�o sendo utilizada essa classe, esse objeto ser� instaciando, por ser est�tico
    // private static final AviaoSingleton INSTANCE = new AviaoSingleton();
    // E essa � a forma Lazy initializaton (inicializa��o pregui�osa) s� ser� iniciado quando for ser utilizado
    private static AviaoSingleton INSTANCE;
    private Set<String> assentosDisponiveis;

    //o synchronized garante a atomicidade(threadsafe) desse m�todo mesmo que tenha mais de uma Thread trabalhando nesse m�todo em nosso sistema
    //assim duas Threads distintas n�o pegaram uma INSTANCE nula ao mesmo tempo
    public synchronized static AviaoSingleton getINSTANCE() {
        //essa verifica��o foi incluida por conta do lazy, sem o lazy s� teria a linha de return INSTANCE
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
