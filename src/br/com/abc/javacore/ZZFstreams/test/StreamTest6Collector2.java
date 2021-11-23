package br.com.abc.javacore.ZZFstreams.test;

import br.com.abc.javacore.ZZFstreams.classes.Genero;
import br.com.abc.javacore.ZZFstreams.classes.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

//agrupamento
//public class StreamTest6Collector2 {
//    public static void main(String[] args) {
//        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
//        //Faça o mapeamento de todas as pessoas por genero
//        //Como era antes
//        Map<Genero, List<Pessoa>> generoListMap = new HashMap<>();
//        List<Pessoa> masculinos = new ArrayList<>();
//        List<Pessoa> femininos = new ArrayList<>();
//
//        for (Pessoa pessoa : pessoas) {
//            if (pessoa.getGenero().equals(Genero.FEMININO)) {
//                femininos.add(pessoa);
//            } else {
//                masculinos.add(pessoa);
//            }
//        }
//
//        generoListMap.put(Genero.FEMININO, femininos);
//        generoListMap.put(Genero.MASCULINO, masculinos);
//
//        System.out.println(generoListMap);
//
//        //Foram 11 linhas apenas para fazer  o agrupamento, mas com streams com apenas uma você resolve
//        Map<Genero, List<Pessoa>> collect = pessoas.stream()
//                .collect(Collectors.groupingBy(Pessoa::getGenero));
//
//        System.out.println(collect);
//
//        //agrupando por genero e quantidade
//        Map<Genero, Long> collect1 = pessoas.stream()
//                .collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.counting()));
//        System.out.println(collect1);
//
//        //agrupando por genero e estatisticca
//        Map<Genero, DoubleSummaryStatistics> collect2 = pessoas.stream()
//                .collect(Collectors.groupingBy(Pessoa::getGenero, Collectors.summarizingDouble(Pessoa::getSalario)));
//        System.out.println(collect2);
//    }
//}
