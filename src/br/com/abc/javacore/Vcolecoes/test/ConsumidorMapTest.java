package br.com.abc.javacore.Vcolecoes.test;

import br.com.abc.javacore.Vcolecoes.classes.Consumidor;
import br.com.abc.javacore.Vcolecoes.classes.Produto;

import java.util.HashMap;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        /*
        lembre-se da regra, que no Map eu não consigo adicionar objetos iguais
         */
        Consumidor consumidor = new Consumidor("William", "122");
        Consumidor consumidor2 = new Consumidor("DevDojo", "321");
        Produto produto1 = new Produto("123","Laptop",2000);
        Produto produto2 = new Produto("321","Picanha",26.4);
        Produto produto3 = new Produto("879","Teclado",1000);
        Produto produto4 = new Produto("012","Celular",2500.0);
        //agora eu quero associar um consumidor a um determinado produto
        Map<Consumidor,Produto> map = new HashMap<>();
        map.put(consumidor, produto2);
        map.put(consumidor2, produto4);
        for (Map.Entry<Consumidor, Produto> entry: map.entrySet() ) {
            System.out.println(entry.getKey().getNome()+ " " + entry.getValue().getNome());
        }
    }
}
