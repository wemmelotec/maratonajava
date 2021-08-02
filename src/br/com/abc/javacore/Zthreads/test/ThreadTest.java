package br.com.abc.javacore.Zthreads.test;
/*
Threads podem ser vista de duas formas, como uma classe, pois existe uma classe no java
e como uma linha de execu��o, um homem trabalhando.
O que possibilita as v�rias funcionalidades em paralelo de um sistema s�o as threads
Se um sistema s� tivesse uma thread ele s� poderia executar uma funcionalidade por vez

Existem 2 tipos de threads daemon x user

Voc� s� deve extender uma classe se voc� for especializar ela
 */

class ThreadExample extends Thread {
    private char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override //a m�gica toda acontece aqui
    public void run() {
        System.out.println(Thread.currentThread().getName());
        //aqui � o c�digo que eu quero que seja executado em paralelo
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
        //o c�dgigo acima serve para mostrar que existe apenas uma thread sendo executada nesse caso

        //para iniciar outras threads execute o start
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
