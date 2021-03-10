package br.com.abc.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        //List mantém a ordem baseado no indice de entrada na lista, ele não ordena para adicionar
        List<String> nomes = new ArrayList<>();
        nomes.add("William");
        nomes.add("Suane");
        nomes.add("DevDojo");
        nomes.add("Wellignton");
        nomes.add("Artur");
        for (String x:nomes) {
            System.out.print(x+"\t\t");
        }
        System.out.println("");
        //para ordenar essa lista eu posso utilizar a classe utilitátia Collections método sort
        Collections.sort(nomes);
        for (String x:nomes) {
            System.out.print(x+"\t\t");
        }
        System.out.println("");
        List<Double> numeros = new ArrayList<>();
        numeros.add(1.1);
        numeros.add(3d);
        numeros.add(1.5);
        numeros.add(0.9);
        numeros.add(10d);
        for (Double x:numeros) {
            System.out.print(x+"\t\t");
        }
        Collections.sort(numeros);
        System.out.println("");
        for (Double x:numeros) {
            System.out.print(x+"\t\t");
        }
    }
}
