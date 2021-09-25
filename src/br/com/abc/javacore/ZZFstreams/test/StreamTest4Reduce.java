package br.com.abc.javacore.ZZFstreams.test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

//o reduce pega uma stream e transforma em um resultado único, final.
public class StreamTest4Reduce {
    public static void main(String[] args) {
        Stream<Integer> integerStream = asList(4,2,2,3,3,9,5,6).stream();

//        List<Integer> collect = integerStream
//                .distinct()
//                .sorted(Comparator.comparing(Integer::intValue))
//                .collect(Collectors.toList());
//        System.out.print(collect);

        Optional<Integer> reduce = integerStream.reduce((x, y) -> x + y);
        System.out.println(reduce.get());
    }
}
