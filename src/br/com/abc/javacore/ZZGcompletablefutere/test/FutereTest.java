package br.com.abc.javacore.ZZGcompletablefutere.test;

import java.util.concurrent.*;

public class FutereTest {
    private static ExecutorService executorService = Executors.newFixedThreadPool(1);//cria uma pool de duas threads

    public static void main(String[] args) {
        //esse Futere simula um processamento do qual eu não tenho controle do tempo de resposta
        //por exemplo, o consumo em uma api externa
        Future<Double> future = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);//vai dormir por dois segundos
            return 2000D;
        });
        //enquanto eu consumo a API e aguardo a resposta o sistema executa este método
        enrolando();//esse método funciona independente do futere

        try {
            Double aDouble = future.get(3, TimeUnit.SECONDS);//espere apenas o tempo do timeout segundo
            System.out.println(aDouble);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
    }
    //essa soma é o que o meu cliente estará fazendo enquanto o processamento futere não é executado
    public static void enrolando(){
        long soma = 0;
        for (int i = 0; i < 1000000; i++) {
            soma+=i;
        }
        System.out.println(soma);
    }
}
