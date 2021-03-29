package br.com.abc.javacore.expressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesMetaCaractTest {
    public static void main(String[] args) {
        //meta caracteres
        // \d buscar em um texto, todos os digitos
        // \D buscar em um texto, todos os caracteres que n�o forem digitos
        // \s buscar em um texto, espa�os em branco \t \n \f \r
        // \S,..., caractere que n�o � branco
        // \w,..., caracteres de palavras a-z A-Z, digitos e _
        // \W,..., tudo que n�o for um caracter de palavra
        String regex = "\\D"; //quero encontrar
        String texto = "#@aba1278aaba021021"; //meu texto
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Express�o: "+matcher.pattern());
        System.out.println("Posi��es encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() +" "+matcher.group());
        }
    }
}
