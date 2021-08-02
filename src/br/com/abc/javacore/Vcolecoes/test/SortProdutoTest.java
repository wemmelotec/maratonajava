package br.com.abc.javacore.Vcolecoes.test;

import br.com.abc.javacore.Vcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//vou utilizar o Comparator para o caso do cliente resolver mudar o método de ordenação depois de uma forma que havia sido
//implementada, em nosso exemplo, implementamos no preço com o Comparable

class ProdutoNomeComparator implements Comparator<Produto>{
//essa classe vai implamtar a ordenaçao por nome sem mexer no que já havia sido implementado
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123","Laptop",2000);
        Produto produto2 = new Produto("321","Picanha",26.4);
        Produto produto3 = new Produto("879","Teclado",1000);
        Produto produto4 = new Produto("012","Celular",2500.0);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        for (Produto x:produtos) {
            System.out.println(x);
        }
        System.out.println("");
        //só pude utilizar esse método na lista de produtos, pois implementei o método compareTo da interface Comparable
        Collections.sort(produtos);
        for (Produto x:produtos) {
            System.out.println(x);
        }
        System.out.println("");
        Collections.sort(produtos,new ProdutoNomeComparator());
        for (Produto x:produtos) {
            System.out.println(x);
        }
    }
}
