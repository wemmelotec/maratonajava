package br.com.abc.javacore.Qexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesBuscarEmail {
    public static void main(String[] args) {
        // . é um coringa e \\. é do texto
        // caracter de negação ^
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";//isso é uma busca
        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail, teste@gmail.com.br, teste@mail";
        System.out.println("Email válido? "+"#@!abrao@mail".matches(regex));//isso é uma validação
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 012345678901234567");
        System.out.println("Expressão: "+matcher.pattern());
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() +" "+matcher.group());
        }
    }
}
