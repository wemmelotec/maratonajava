package br.com.abc.javacore.ZZFstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest2 {
    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>();
        nomes.add(asList("DevDojo", "Valeu por aumentar a letar"));
        nomes.add(asList("William", "por que vc demorou"));
        System.out.println(nomes);
        //agora eu quero extrair essa string e concatenar tudo em um lugar só, utilize o flat map
        List<String> collect = nomes.stream()
                .flatMap(Collection::stream) //é utilizado para extrair um valor dentro do outro
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
