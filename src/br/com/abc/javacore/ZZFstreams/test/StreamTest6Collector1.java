package br.com.abc.javacore.ZZFstreams.test;

import br.com.abc.javacore.ZZFstreams.classes.Pessoa;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest6Collector1 {
    public static void main(String[] args) {
        //redução e sumarização de stremas em um valor único
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        //como era para contar a quantidade de pessoas
        System.out.println(pessoas.stream().count());

        //agora com o framework collect
        System.out.println(pessoas.stream().collect(Collectors.counting()));

        Optional<Pessoa> max = pessoas.stream()
                .max(Comparator.comparing(Pessoa::getSalario));
        System.out.println(max.get().getSalario());

        Optional<Pessoa> collect = pessoas.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Pessoa::getSalario)));
        System.out.println(collect.get().getSalario());


        DoubleSummaryStatistics collect1 = pessoas.stream()
                .collect(Collectors.summarizingDouble(Pessoa::getSalario));
        System.out.println(collect1);



    }
}
