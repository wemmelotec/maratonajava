package br.com.abc.javacore.Pdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
    public static void main(String[] args) {
        //date calender time
        Date data = new Date();
        System.out.println(data);

        //Calendar é uma classe abastrata logo eu não posso instaciar ela
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        Date date2 = c.getTime();
        System.out.println(date2);
    }
}
