package br.com.abc.javacore.Qexpressoesregulares.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarSenhaComRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[A-Z]{1}[a-zA-Z0-9]{6,8}";
        Pattern pattern = Pattern.compile(regex);

        System.out.println("Digite sua senha com no máximo 6 caraters alfanuméricos");
        Matcher matcher = pattern.matcher(scanner.next());

        System.out.println(matcher.matches());


    }
}
