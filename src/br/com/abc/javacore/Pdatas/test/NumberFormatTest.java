package br.com.abc.javacore.Pdatas.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        float valor = 123.4567f;
        //criar uma localização
        Locale locFra = new Locale("fr");
        Locale locUs = new Locale("us");
        //criar um NumberFormat
        NumberFormat[] nfa = new NumberFormat[6];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locFra);
        nfa[2] = NumberFormat.getInstance(locUs);
        nfa[3] = NumberFormat.getCurrencyInstance();
        nfa[4] = NumberFormat.getCurrencyInstance(locFra);
        nfa[5] = NumberFormat.getCurrencyInstance(locUs);
        for (NumberFormat nf: nfa) {
            System.out.println(nf.format(valor));
        }
        System.out.println("**********");
        NumberFormat numberFormat = NumberFormat.getInstance();
        String valorRecebidoEmString = "212,4567";
        try {
            System.out.println(numberFormat.parse(valorRecebidoEmString));
            numberFormat.setParseIntegerOnly(true);
            System.out.println(numberFormat.parse(valorRecebidoEmString));
        } catch (ParseException e) {//é uma exceção lançada quando vem letras
            e.printStackTrace();
        }
    }
}
