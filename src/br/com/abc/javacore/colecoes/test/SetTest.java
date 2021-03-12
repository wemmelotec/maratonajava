package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123","Laptop",2000);
        Produto produto2 = new Produto("321","Picanha",26.4);
        Produto produto3 = new Produto("879","Teclado",1000);
        Produto produto4 = new Produto("012","Celular",2500.0);
        Produto produto5 = new Produto("999","Geladeira",3000d);
        //Essa é uma coleção de alto desempenho
        //Como ela não é indexada não existe nenhum tipo de ordem
        Set<Produto> produtoSet = new HashSet<>();
        //a principal característica so set é que ele não permite elementos duplicados
        //quando eu utilizo o add do set, ele automaticamente utiliza o equals e o hashcode, e caso o objeto já exista ele não adiciona
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        //como uma coleção set não é indexada, para percorre-lá eu utilizo o iterotor ou o foreach
        for (Produto produto:produtoSet) {
            System.out.println(produto);
        }

        //mas caso eu queira ao menos manter a ordem de inserção?
        //então devo utilizar o set com LinkedHashSet
    }
}
