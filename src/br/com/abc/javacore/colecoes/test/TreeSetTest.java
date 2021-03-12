package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Celular;
import br.com.abc.javacore.colecoes.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123","Laptop",2000);
        Produto produto2 = new Produto("321","Picanha",26.4);
        Produto produto3 = new Produto("879","Teclado",1000);
        Produto produto4 = new Produto("012","Celular",2500.0);
        Produto produto5 = new Produto("012","Celular",3000d);
        //Celular celular = new Celular("Iphone 7","1234");
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        //NavigableSet<Celular> celularNavigableSet = new TreeSet<>();
        //primeira regra do NavigableSet
        //o objeto que vai ser implementado tem que ter o comparable implementado, celular por exemplo, não tem
//        celularNavigableSet.add(celular);
//        for (Celular celular1:celularNavigableSet) {
//            System.out.println(celular1);
//        }

        //a grande vantagem no TreeSet é que os objetos são ordenados automaticamente
        //por conta disso ele é um pouco mais lento
        //observer que como o comparable foi implementado no preço, ele ordenará por preço
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);
        for (Produto produro:produtoNavigableSet) {
            System.out.println(produro);
        }
        System.out.println("-----------");
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(produtoNavigableSet.lower(produto4));//qual é o produto com o preço mais baixo antes do produto4
    }
}
