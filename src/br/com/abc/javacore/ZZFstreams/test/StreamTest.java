package br.com.abc.javacore.ZZFstreams.test;

import br.com.abc.javacore.ZZFstreams.classes.Pessoa;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        //como era no java7
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        //primeira coisa ordenar a lista
        /*
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
         */
        Collections.sort(pessoas, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));

        //criar a lista que vai receber os dados filtrados
        List<String> nomes = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 25) {
                nomes.add(pessoa.getNome());
                if (nomes.size() >= 3) {
                    break;
                }
            }
        }
        System.out.println(nomes);
        //Intermediário e terminal
        //Intermediário sempre retornam streams que permitem o encadeamento
        //Terminal
        //agora a partir do java 8 com as streams
        List<String> nomes2 = pessoas.stream()
                .filter(p->p.getIdade()<25) //filtrei na lista pessoas com menos de 25    - intermediário
                .sorted(Comparator.comparing(Pessoa::getNome)) //agora ordenei            - intermediário
                .limit(3) //limitou por três                                              - intermediário
                .skip(1) //pulei o primeiro registro
                .map(Pessoa::getNome) //extrai apenas os nomes da lista pessoas           - intermediário
                .collect(Collectors.toList()); //coleta tudo e joga para a lista de nomes - terminal
        System.out.println(nomes2);


        //fiz isso depois que eu criei o equals e hashcode e dupliquei a mercy na lista
        System.out.println(pessoas.stream()
                .distinct() //não deixa repetir
                .filter(pessoa -> pessoa.getIdade()<25)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .map(Pessoa::getNome)
                .count());

        //pessoas.stream().forEach(System.out::println);
    }
}

