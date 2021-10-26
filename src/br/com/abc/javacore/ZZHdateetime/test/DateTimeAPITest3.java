package br.com.abc.javacore.ZZHdateetime.test;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeAPITest3 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019, Month.FEBRUARY,25);
        System.out.println(localDate);
        //caso você queira mudar o valor dessa variável, você não consegue na mesma, pois ela é threadsafe
        //mas ela cria outra variavel com a mudança efetuada
        //isso vale para os outros parametros
        LocalDate localDate1 = localDate.withYear(2021);
        System.out.println(localDate1);

    }
}
