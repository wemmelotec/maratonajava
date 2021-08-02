package br.com.abc.javacore.Kinterf.test;


import br.com.abc.javacore.Kinterf.classes.MyClassImpl;
import br.com.abc.javacore.Kinterf.classes.MyClassImpl2;

public class MyClassImplTest {
    public static void main(String[] args) {

        MyClassImpl myClassImpl = new MyClassImpl();
        MyClassImpl2 myClassImpl2 = new MyClassImpl2();

        System.out.println(myClassImpl.reserveString("Gustavo"));
        myClassImpl2.test();

    }
}
