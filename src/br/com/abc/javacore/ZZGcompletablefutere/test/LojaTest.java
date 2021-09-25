package br.com.abc.javacore.ZZGcompletablefutere.test;

import br.com.abc.javacore.ZZGcompletablefutere.classes.Loja;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class LojaTest {
    public static void main(String[] args) {
        Loja americanas = new Loja();
        Loja casasBahia = new Loja();
        Loja bestBuy = new Loja();
        Loja walmarte = new Loja();

//        long star = System.currentTimeMillis();
//        //pegando o preço de forma sincrona
//        System.out.println(americanas.getPreco());
//        System.out.println(casasBahia.getPreco());
//        System.out.println(bestBuy.getPreco());
//        System.out.println(walmarte.getPreco());
//        System.out.println(System.currentTimeMillis() - star + " tempo em ms");

        //invocando os métodos
        long star = System.currentTimeMillis();
        Future<Double> proceAsync = americanas.getProceAsync();
        Future<Double> proceAsync1 = casasBahia.getProceAsync();
        Future<Double> proceAsync2 = bestBuy.getProceAsync();
        Future<Double> proceAsync3 = walmarte.getProceAsync();
        long end = System.currentTimeMillis();
        System.out.println("Tempo de invocação do método" + (end - star) + "ms");
        enrolando();//aqui você pode colocar umas propagandas ou outras informações
        //agora vamos pegar os preços
        try {
            System.out.println("Americanas " + proceAsync.get());
            System.out.println("Casas Bahia " + proceAsync1.get());
            System.out.println("BestBuy " + proceAsync2.get());
            System.out.println("WalMarte " + proceAsync3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Tempo total" + (System.currentTimeMillis() - star) + "ms");
    }

    public static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1000000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
