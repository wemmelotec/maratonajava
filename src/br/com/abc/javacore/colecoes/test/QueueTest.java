package br.com.abc.javacore.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();//ele ordena todos os objetos que forem colocados nessa coleção
        //lembre-se que a classe String implementa o Comparable
        queue.add("C");
        queue.add("A");
        queue.add("D");
        queue.add("P");
        System.out.println(queue.peek());//ctrl+q para saber a função do método
        System.out.println(queue.poll());//ctrl+q para saber a função do método
        System.out.println(queue.poll());//ctrl+q para saber a função do método
        System.out.println(queue.poll());//ctrl+q para saber a função do método
        System.out.println(queue.poll());//ctrl+q para saber a função do método
        System.out.println(queue.poll());//ctrl+q para saber a função do método
        System.out.println(queue.remove());


    }
}
