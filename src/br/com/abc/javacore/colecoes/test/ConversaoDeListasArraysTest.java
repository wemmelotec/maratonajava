package br.com.abc.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//como converter listas para arrays
public class ConversaoDeListasArraysTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        Integer[] numerosArray = new Integer[numeros.size()];
        numeros.toArray(numerosArray);
        System.out.println(numeros);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println("***Agora o contrário***");
        Integer[] numerosArrays2 = new Integer[4];
        numerosArrays2[0]=10;
        numerosArrays2[1]=9;
        numerosArrays2[2]=8;
        numerosArrays2[3]=7;
        //esse método asList deixa numerosArrays2 e numeros2 no mesmo RIP
        //ou seja, o que eu fizer em um altera no outro
        List<Integer> numeros2 = Arrays.asList(numerosArrays2);
        numeros2.set(0,1);
        //veja o problema de estarem ligadas na linha abaixo
        //numeros2.add(10); na lista eu poderia adicionar sem problema, mas o Array tem tamanho fixo
        System.out.println(Arrays.toString(numerosArrays2));
        System.out.println(numeros2);
        //para conseguir disvincular tenho que fazer uma gambiarra
        List<Integer> numeros3 = new ArrayList<>();
        numeros3.addAll(numeros2);
        //agora sim eu posso adicionar
        numeros3.add(10);
        System.out.println(numeros3);


    }
}
