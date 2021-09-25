package br.com.abc.javacore.ZZFstreams.test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//gerando streams
public class StreamTest5 {
    public static void main(String[] args) {
        //criar uma stream de 1 a 100 e imprimir todos os números pares
        IntStream.rangeClosed(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " ")); //inclui o último número
        System.out.println("");
        IntStream.range(1, 50)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " ")); //não inclui o último número
        System.out.println();
        //criar streams diretamente de palavras
        Stream<String> stringStream = Stream.of("william", "wellington", "devdojo");
        stringStream.map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        //transformando um array e uma stream
        int[] inteiros = {1, 2, 3, 4, 6, 7, 8};
        System.out.println(Arrays.stream(inteiros).sum());
        System.out.println(Arrays.stream(inteiros).max());
        System.out.println(Arrays.stream(inteiros).min());
        System.out.println(Arrays.stream(inteiros).average());

        System.out.println();
        //trabalhando com o try with resources de uma stream a partir de um arquivo
        try (Stream<String> lines = Files.lines(Paths.get("C:\\workspace\\maratonajava\\src\\documentacao.txt"),Charset.defaultCharset())) {
            lines.flatMap(line->Arrays.stream(line.split("\n")))
                    .filter(p->p.contains("associado"))
                    .forEach(System.out::println);
        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println();
        //stream infinitas
        Stream.iterate(1,n->n+2).limit(10).forEach(System.out::println);

    }
}
