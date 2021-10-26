package br.com.abc.javacore.ZZHdateetime.test;

import br.com.abc.javacore.ZZHdateetime.util.ObterProximoDiaUtil;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPITest4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(date);
        date = date.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println(date);

        System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());
        System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());

        date = date.with(new ObterProximoDiaUtil());
        System.out.println(date);
    }
}
