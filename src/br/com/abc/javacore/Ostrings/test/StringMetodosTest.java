package br.com.abc.javacore.Ostrings.test;

import java.util.Locale;

public class StringMetodosTest {
    public static void main(String[] args) {
        String teste = "Goku";
        String teste2 = "        goku";
        String teste3 = "AAAooo";
        String teste4 = "0123456789";
        System.out.println(teste.charAt(2));//retorna a letra na posição do indice indicado
        System.out.println(teste==teste2);//não é indicado para strings
        System.out.println(teste.equalsIgnoreCase(teste));//indicado para comparar strings
        System.out.println(teste.length());//tamanho da string
        System.out.println(teste3.replace('A','b'));
        System.out.println(teste3.toLowerCase());
        System.out.println(teste3.toUpperCase());
        System.out.println(teste4.substring(0,4));
        System.out.println(teste2);
        System.out.println(teste2.trim());

    }
}
