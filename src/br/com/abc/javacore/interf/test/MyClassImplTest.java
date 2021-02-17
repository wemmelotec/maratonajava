package br.com.abc.javacore.interf.test;


import br.com.abc.javacore.interf.classes.MyClassImpl;
import br.com.abc.javacore.interf.classes.MyClassImpl2;

public class MyClassImplTest {
    public static void main(String[] args) {

        MyClassImpl myClassImpl = new MyClassImpl();
        MyClassImpl2 myClassImpl2 = new MyClassImpl2();

        System.out.println(myClassImpl.reserveString("Gustavo"));
        myClassImpl2.test();

    }
}
