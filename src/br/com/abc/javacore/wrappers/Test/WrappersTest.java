package br.com.abc.javacore.wrappers.Test;

public class WrappersTest {
    public static void main(String[] args) {
        /*
        para decorar os 8 tipos primitivos do Java, comece do menor para o maior pelos n�mericos que s�o 6
        e depois dos outros 2 que n�o s�o num�ricos
         */
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublrPrimitivo = 10D;
        char charPrimitivo = 'A';
        boolean bolleanPrimitivo = true;

        //tipos wrappers
        Byte byteWrapper = 1;
        Short shortWrapper = 1;//autoboxing � pegar um tipo primitivo e colocar num wrapper
        Integer intergerWrapper = 1;
        Long longWrapper = Long.valueOf("10");
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character charWrapper = 'A'; //essa � a �nica classe que n�o aceita String e a converte
        Boolean booleanWrapper = true;

        int i = intergerWrapper; //isso � um unboxing

        String valor = "10";
        Float f = Float.parseFloat(valor);//o parse � um m�todo muito importante dentro das classes wrappers
        System.out.println(f);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));

    }
}
