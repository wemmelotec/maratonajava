package br.com.abc.javacore.Qexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesBuscarEmail {
    public static void main(String[] args) {
        // . � um coringa e \\. � do texto
        // caracter de nega��o ^
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";//isso � uma busca
        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail, teste@gmail.com.br, teste@mail";
        System.out.println("Email v�lido? "+"#@!abrao@mail".matches(regex));//isso � uma valida��o
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 012345678901234567");
        System.out.println("Express�o: "+matcher.pattern());
        System.out.println("Posi��es encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() +" "+matcher.group());
        }
    }
}
