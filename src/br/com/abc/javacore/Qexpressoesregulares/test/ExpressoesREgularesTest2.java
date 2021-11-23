package br.com.abc.javacore.Qexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesREgularesTest2 {
    public static void main(String[] args) {
        //1 formar de criar um padr�o de regex
        Pattern expressaoCompilada = Pattern.compile(".a"); //verifica se a segunda letra � a (o . faz ignorar a posi��o 0)
        Matcher matcher = expressaoCompilada.matcher("sa");

        System.out.println(matcher.find());
        try{
            System.out.println(matcher.start());
        } catch (Exception e) {
            System.out.println("N�o encontrei a express�o no texto");;
        }
        System.out.println("*********");
        //2 forma de criar um padr�o de regex
        System.out.println(Pattern.compile("p").matcher("april").find());
        System.out.println("*********");
        //mais exemplos
        System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)
        System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)
        System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)
        System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)

        System.out.println("***********");
        //verificar se existe s� um digito
        Pattern expressaoCompilada2 = Pattern.compile("\\d");
        Matcher matcher1 = expressaoCompilada2.matcher("abcd");
        System.out.println(matcher1.matches());

    }
}
