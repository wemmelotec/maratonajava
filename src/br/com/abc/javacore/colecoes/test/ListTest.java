package br.com.abc.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //o generics me permite definir o tipo de objeto que a lista vai receber
        //por conta da escrita diamond eu só preciso definir do lado esquerdo, no lado direito ele já entende qual é o tipo
        //e não pode ser diferente
        //regra: eu não posso criar collections utilizando tipos primitivos, pois tipos primitivos não possuem métodos e a lista utiliza o equals e o hashcode
        List<String> nomes = new ArrayList<>();
        nomes.add("wellington");
        nomes.add("devdojo");
        System.out.println("size"+ nomes.size());
        nomes.remove("devdojo");
        System.out.println("size"+ nomes.size());
        for (String x:nomes) {
            System.out.println(x);
        }

        //para transferir os objetos de uma lista para outra
        List<String> nomes2 = new ArrayList<>();
        nomes2.addAll(nomes);
        System.out.println("size nomes2 " + nomes2.size());

        /*
        esse são os métodos mais comuns do ArrayList add, remove, size e addAll
         */

    }
}
