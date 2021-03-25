package br.com.abc.javacore.strings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(10000);
        long fim = System.currentTimeMillis();
        System.out.println(fim-inicio);

        inicio = System.currentTimeMillis();
        concatStringBuilder(10000);
        fim = System.currentTimeMillis();
        System.out.println(fim-inicio);
    }

    private static void concatString(int tam) {
        String string ="";
        for(int i=0; i < tam ; i++){
            string+=i;
        }
    }private static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder(tam);
        for(int i=0; i < tam ; i++){
            sb.append(i);
        }
    }

}
