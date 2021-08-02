package br.com.abc.javacore.ZZBpadroesdeprojeto.classes;
/*
O padrão de projeto factory é quando você tem um método que retorna um objeto concreto de uma determinada classe
isso pode ser visto no conectionfactory do crud
Ele desacopla a criação do objeto com a utilização deles em nossas classes
 */
//essa vai ser a classe responsável por criar a moeda pedindo apenas o pais

public class MoedaFactory {
    public static Moeda criarMoeda(Pais pais){
        if (pais.equals(Pais.BRASIL)){
            return new Real();
        }else if (pais.equals(Pais.EUA)){
            return new USDolar();
        }
        throw new IllegalArgumentException("Não existe esse pais");
    }
}
