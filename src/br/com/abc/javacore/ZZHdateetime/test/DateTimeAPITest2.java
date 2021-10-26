package br.com.abc.javacore.ZZHdateetime.test;

import br.com.abc.javacore.Gassociacao.atividade.classes.Local;

import java.time.*;

public class DateTimeAPITest2 {
    public static void main(String[] args) {
        //precisão em nano segundos
        Instant instant = Instant.now();
        //duration serve para pegar o intervalo entre duas datas
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2017,1,1,23,0,0);
        LocalTime localTime = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(5,0,0);
        Duration dt1 = Duration.between(localDateTime, localDateTime1);
        Duration dt2 = Duration.between(localTime, localTime2);
        System.out.println(dt1);
        System.out.println(dt2);
        //periodo
        Period p1 = Period.between(localDateTime.toLocalDate(),localDateTime1.toLocalDate());
        System.out.println(p1);
    }
}
