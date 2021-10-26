package br.com.abc.javacore.ZZHdateetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeAPITest1 {
    public static void main(String[] args) {
        //classe criada para trabalhar somente com as datas
        LocalDate date = LocalDate.of(2021, Month.SEPTEMBER, 28);
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println("----LocalDateTime");
        System.out.println(LocalDateTime.now());

        System.out.println("-------Parse de datas strings para objetos java");
        LocalDate localDate = LocalDate.parse("2021-09-28");
        //LocalDateTime localDateTime = LocalDateTime.parse("13:23:12");

        System.out.println(localDate);
        //System.out.println(localDateTime);
    }
}
