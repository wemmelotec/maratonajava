package br.com.abc.javacore.crud.test;

import br.com.abc.javacore.crud.classes.Produto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainItaretor {
    public static void main(String[] args) {
        List<Produto> listaDeProdutos = new LinkedList<>();
        Produto p1 = new Produto("arroz",1);
        Produto p2 = new Produto("feijão",5);
        Produto p3 = new Produto("macarrão",0);
        Produto p4 = new Produto("farinha",5);
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        listaDeProdutos.add(p4);
        System.out.println(p2.getQuantidade());
        Iterator<Produto> produtoIterator = listaDeProdutos.iterator();
        while (produtoIterator.hasNext()){
            if(produtoIterator.next().getName().equalsIgnoreCase(p2.getName())){
                int quantidadeAtual = produtoIterator.next().getQuantidade();
                quantidadeAtual--;
                produtoIterator.next().setQuantidade(quantidadeAtual);
            }else{
                System.out.println("fora do if");
            }
        }
        System.out.println(p2.getQuantidade());
    }
}
