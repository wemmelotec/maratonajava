package br.com.abc.javacore.streams;

import java.util.Arrays;
import java.util.List;

public class JavaStreamsExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Streams", "Not","Wellington", "Gusvato");
        /*
        O exemplo a seguir demonstra como usar streams para filtrar uma lista,
        realizar uma operação de mapeamento e criar uma string de resultado final com o reducemétodo.

        The following example demonstrates how to use streams to filter a list,
        perform a mapping operation and to create one final result string from it with the reduce method.
         */
        String result = list.stream().
                filter(s->s.contains("e")).
                map(s-> s.toLowerCase() ).
                reduce("", (a,b)-> a+ " " + b);

        System.out.println(result + "!");

    }
}
