package br.com.abc.javacore.ZZGcompletablefutere.classes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Loja {
    //método sincrono
    public double getPreco(){
        //vai pegar o preço bem longe
        return calcularPreco();
    }

    //metodo assincrono
    public Future<Double> getProceAsync(){
        CompletableFuture<Double> precoFuturo = new CompletableFuture<>();
        //criando uma Thread para cada invocação deste método
        new Thread(()->{
            precoFuturo.complete(calcularPreco());
        }).start();
        return precoFuturo;
    }


    //serve apenas para dar uma atrasada no processamento
    private static void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //método remoto
    private double calcularPreco(){
        delay();
        return ThreadLocalRandom.current().nextDouble() *100; //cria um preço aleatório * 100
    }
}
