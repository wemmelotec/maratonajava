package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new LinkedList<>();//troquei para LinkedList pois ele � mais r�pido do que o ArrayList para o remove
        Produto produto1 = new Produto("123","Laptop",2000d,0);
        Produto produto2 = new Produto("321","Picanha",26.4,10);
        Produto produto3 = new Produto("879","Teclado",1000d,5);
        Produto produto4 = new Produto("012","Celular",2500.0,1);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        /*
        Eu n�o posso simplesmente percorrer a lista com o for e utilizar o remove dentro do for
        pois eu n�o posso alterar a lista em tempo de execu��o no for
         */
        //Outra forma de voc� iterar sobre uma lista � o iterator
        //O produtoIterator � como se fosse a pessoa que est� apontando para a fila
        Iterator<Produto> produtoIterator = produtos.iterator();
        //True se tiver um pr�ximo objeto na lista
        while (produtoIterator.hasNext()){
            /*
            Imagine que voc� est� olhando para uma fila.
            Na op��o acima, voc� verifica se existe uma pessoa.
            Na linha abaixo voc� chama a pessoa e colaca na vari�vel
             */
            //Produto produto = produtoIterator.next(); como o produtoIterator.next() retorna um objeto vou concatenar os m�todos dentro do if
            if(produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
        //ou poderia utilizar o lambda e remover com apenas uma linha
        produtos.removeIf(p->p.getQuantidade()==1);
        System.out.println(produtos.size());
    }
}
