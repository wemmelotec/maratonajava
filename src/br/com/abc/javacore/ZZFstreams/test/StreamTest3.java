package br.com.abc.javacore.ZZFstreams.test;

import br.com.abc.javacore.ZZFstreams.classes.Pessoa;

import java.util.List;

public class StreamTest3 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        //anymatch
        System.out.println(pessoas.stream()
                .anyMatch(p -> p.getSalario() > 4000)); //serve para verificar se tem alguém com salário maior que 4000

        //allmatch
        System.out.println(pessoas.stream()
                .allMatch(p -> p.getIdade() > 18));  //todos dessa lista são maiores de 18 anos

        //noneMatch
        System.out.println(pessoas.stream()
                .noneMatch(p -> p.getIdade() > 18)); //alguém não é maior de 18

        //Optional com stream, vc quer saber se existe qualquer pessoa dentro dessa lista, com idade menor de 25
        pessoas.stream()
                .filter(p -> p.getIdade() < 25)
                .findAny() //diferente no anymatch que retorna um booleano, esse retorna um optional do objeto da lista
                .ifPresent(pessoa -> System.out.println(pessoa.getNome())); //se for diferente de nulo imprima o valor

        pessoas.stream()
                .filter(pessoa -> pessoa.getIdade()>30)
                .findFirst()
                .ifPresent(pessoa -> System.out.println(pessoa.getNome()));
    }
}
