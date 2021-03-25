package br.com.abc.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = new Locale("it","IT");//italiano
        Locale localeIndiano = new Locale("hi","IN");//indiano
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println("*********");
        c.set(2015, Calendar.DECEMBER, 23);
        System.out.println(c.getTime());
        System.out.println("*********");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
        System.out.println(df.format(c.getTime()));
        System.out.println("**********");
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
        //como se escreve Itália em indiano
        System.out.println(locale.getDisplayLanguage(localeIndiano));

        String[] idiomas = Locale.getISOLanguages();
        for (String idioma: idiomas) {
            System.out.println(idioma);
        }

    }
}
