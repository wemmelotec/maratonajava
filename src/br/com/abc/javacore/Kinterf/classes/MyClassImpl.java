package br.com.abc.javacore.Kinterf.classes;

public class MyClassImpl implements MyInterface{

    @Override
    public void test() {
        System.out.println("Dentro da classe MyClassImpl");
    }

    @Override
    public void write(String s) {

    }


    public String reserveString(String s) {
        String receiveNameReverse = new StringBuilder(s).reverse().toString();
        return receiveNameReverse;
    }
}
