package br.com.abc.javacore.exception.unchecked.test;

import br.com.abc.javacore.exception.unchecked.classes.MyClass;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.causeANullPointerException();
    }
}
