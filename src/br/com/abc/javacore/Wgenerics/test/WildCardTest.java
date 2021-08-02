package br.com.abc.javacore.Wgenerics.test;
/*
Wildcard � o caracter coringa de generics
 */

import java.util.ArrayList;
import java.util.List;

abstract class Animal{
    public abstract void consulta();
}
class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}
class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}
public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(),new Cachorro()};
        Gato[] gatos = {new Gato(),new Gato()};
        consultarAnimais(cachorros);
        consultarAnimais(gatos);
        //o Array me permite fazer o uso do polimorfismo como na linha baixo
        //pois como cachorro � uma subclasse de animal o array permite isso
        //j� com as Collections eu n�o posso criar uma m�todo que receba como par�metro uma lista de animais
        //e passar uma de cachorro ou gato
        Animal[] animais = new Cachorro[3];

        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());
        consultarAnimaisList(cachorroList);
    }
    public static void consultarAnimais(Animal[] animais){
        for (Animal animal:animais) {
            animal.consulta();
        }
    }
    //Wildcard � o caracter coringa de generics
    //com isso eu posso passar qualquer lista de uma subclasse de Animal
    public static void consultarAnimaisList(List<? extends Animal> animais){
        for (Animal animal:animais) {
            animal.consulta();
        }
    }
}
