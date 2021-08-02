package br.com.abc.javacore.Qexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesRangerDeCaractTest {
    public static void main(String[] args) {
        //Quantificadores, para conseguir realizar a mesma busca mais vezes
        //? = zero ou uma
        //* = zerou ou mais
        //+ = uma ou mais
        //{n,m} = de n até m
        //() ; | ; $
        //Busca com o range
        String regex = "0[xX]([a-fA-F])+\\s"; //quero encontrar o a, o b ou o c [abc], (A, B ou C maiúsculo) especificamente a letra
        //busca por intervalos [a-f]=[abcdef] [0-9]=[0123456789]
        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1"; //meu texto
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: "+matcher.pattern());
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() +" "+matcher.group());
        }
    }
}
