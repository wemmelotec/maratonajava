package br.com.abc.javacore.ZZBpadroesdeprojeto.classes;
/*
O padr�o de projeto factory � quando voc� tem um m�todo que retorna um objeto concreto de uma determinada classe
isso pode ser visto no conectionfactory do crud
Ele desacopla a cria��o do objeto com a utiliza��o deles em nossas classes
 */
//essa vai ser a classe respons�vel por criar a moeda pedindo apenas o pais

public class MoedaFactory {
    public static Moeda criarMoeda(Pais pais){
        if (pais.equals(Pais.BRASIL)){
            return new Real();
        }else if (pais.equals(Pais.EUA)){
            return new USDolar();
        }
        throw new IllegalArgumentException("N�o existe esse pais");
    }
}
