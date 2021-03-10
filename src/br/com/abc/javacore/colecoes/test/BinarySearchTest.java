package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
O m�todo contains da Lista retorna apenas true or false
E n�s precisamos de algo que procure e caso encontre retorne um ind�ce ou o lugar que deveria ser adicionado
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        //Para utilizar o m�todo Collections.binarySearch a lista precisa estar ordenada. sen�o o resultado n�o ser� previs�vel
        Collections.sort(numeros);
        /*
        regra do ponto de inser��o para quando n�o encontra
        ( -(-ponto de inser��o) - 1)
        por exemplo, se eu quiser buscar o 1
        -1-1=-2, ou seja, o -2 � o indice onde eu deveria adicionar o 1 e mesmo assim manter a lista ordenada
         */
        //indices 0,1,2,3
        //numeros 0,2,3,4
        System.out.println(Collections.binarySearch(numeros,4));
        System.out.println(numeros.get(Collections.binarySearch(numeros,4)));
        System.out.println("*****");
        //como ele n�o vai encontra o 1, ele vai retornar o valor para eu aplicar a form�la e encontra o index
        //para adicionar o 1, sem bagun�ar a ordem da lista, nesse caso seria -(-2) -1 = 1
        System.out.println(Collections.binarySearch(numeros,1));
        numeros.add(1,1);
        for (Integer numero: numeros) {
            System.out.print(numero);
        }
        System.out.println("\n*****");
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123","Laptop",2000);
        Produto produto2 = new Produto("321","Picanha",26.4);
        Produto produto3 = new Produto("879","Teclado",1000);
        Produto produto4 = new Produto("012","Celular",2500.0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos, new ProdutoNomeComparator());
        for (Produto produto:produtos) {
            System.out.println(produto);
        }
        //agora imaginemos que eu tenho outro produto
        Produto produto5 = new Produto("000","Antena",50);
        //agora vou buscar ele na lista, mas eu ainda n�o adicionei ele a lista
        System.out.println(Collections.binarySearch(produtos,produto5,new ProdutoNomeComparator()));
        //esse -1 significa que ele n�o encontrou o objeto produto5, e eu utilizo ele na formula
        //para adicionar o objeto sem bagun�ar a ordem da lista, -(-1)-1 = 0
        produtos.add(0,produto5);
        System.out.println("***");
        for (Produto produto:produtos) {
            System.out.println(produto);
        }
    }
}
