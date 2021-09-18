package br.com.abc.javacore.ZZEOption.test;

import br.com.abc.javacore.ZZEOption.classes.Seguradora;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {

        Seguradora s = new Seguradora("Safe");
       // System.out.println(obterNomeSeguradoraOptinal(s));
    }

    //Uma forma de verificar se o nome existe sem o Optional e evitar o NullPointer
    //Esse método pode ser colocado na classe Seguradora
    private static String obterNomeSeguradora(Seguradora seguradora) {
        String nome = "";
        if (seguradora.getNome() != null) {
            //nome = seguradora.getNome();
        }
        return nome;
    }

    //Agora utilizando o optional
//    private static String obterNomeSeguradoraOptinal(Seguradora seguradora) {
//        //primeiro, como eu não tenho certeza se o nome tem um valor ou não, preciso iniciar um optional
//        //o flatMap serve para extrair uma String dentro de alguma coisa
//        //o map serve para extrair um valor dentro de alguma coisa
//        System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora::getNome));
//        return "";
//    }

    public static String getNomeSeguradora(Seguradora seguradora) {
        //primeiro, como eu não tenho certeza se o nome tem um valor ou não, preciso iniciar um optional
        //o flatMap serve para extrair uma String dentro de alguma coisa
        //o map serve para extrair um valor dentro de alguma coisa
        //System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora::getNome));
        return "";
    }
}
