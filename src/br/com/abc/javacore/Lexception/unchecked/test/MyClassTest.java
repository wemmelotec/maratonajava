package br.com.abc.javacore.Lexception.unchecked.test;

import br.com.abc.javacore.Lexception.unchecked.classes.MyClass;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.causeANullPointerException();
    }
}
