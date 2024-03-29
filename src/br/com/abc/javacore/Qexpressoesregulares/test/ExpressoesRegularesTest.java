package br.com.abc.javacore.Qexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        String regex = "ba"; //quero encontrar
        String texto = "abaaaba"; //meu texto
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: "+matcher.pattern());
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() +"");
        }
    }
}


/*
Link para documentação regex com exemplos

https://www.javatpoint.com/java-regex
 */