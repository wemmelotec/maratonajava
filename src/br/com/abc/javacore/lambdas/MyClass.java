package br.com.abc.javacore.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("wellington", "Silvana", "Gustavo", "Laura");
        list.forEach(s-> System.out.println(s));

        //usando referencias de método
        List<String> list2 = new ArrayList<>();
        list2.add("vogella.com");
        list2.add("google.com");
        list2.add("heise.de");
        list2.forEach(System.out::println);
    }
}
