package br.com.abc.javacore.Pdatas.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String mascara = "'João Pessoa,' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(calendar.getTime()));
    }
}
