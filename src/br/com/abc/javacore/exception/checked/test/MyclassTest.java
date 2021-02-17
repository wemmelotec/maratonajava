package br.com.abc.javacore.exception.checked.test;

import br.com.abc.javacore.exception.checked.classes.Myclass;

public class MyclassTest {
    public static void main(String[] args) {
        Myclass myclass = new Myclass();

        myclass.fileNotFoundExceptionIsCaughtInside();
    }
}
