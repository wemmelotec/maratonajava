package br.com.abc.javacore.Zthreads.test;
/*
Threads podem ser vista de duas formas, como uma classe, pois existe uma classe no java
e como uma linha de execução, um homem trabalhando.
O que possibilita as várias funcionalidades em paralelo de um sistema são as threads
Se um sistema só tivesse uma thread ele só poderia executar uma funcionalidade por vez

Existem 2 tipos de threads daemon x user

Você só deve extender uma classe se você for especializar ela
 */

class ThreadExample extends Thread {
    private char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override //a mágica toda acontece aqui
    public void run() {
        System.out.println(Thread.currentThread().getName());
        //aqui é o código que eu quero que seja executado em paralelo
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}
class ThreadExemploRunnable implements Runnable{

    @Override
    public void run() {

    }
}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());//nome da Thread
        ThreadExample t1 = new ThreadExample('a');
        ThreadExample t2 = new ThreadExample('b');
        ThreadExample t3 = new ThreadExample('c');
        ThreadExample t4 = new ThreadExample('d');

        t1.run();
        t2.run();
        t3.run();
        t4.run();
        //o códgigo acima serve para mostrar que existe apenas uma thread sendo executada nesse caso

        //para iniciar outras threads execute o start
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
