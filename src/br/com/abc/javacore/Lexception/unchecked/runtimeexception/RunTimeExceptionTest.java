package br.com.abc.javacore.Lexception.unchecked.runtimeexception;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        int a = 10 / 0;
        System.out.println(a);
        //para resolver esse erro em tempo de execu��o acima, poderiamos criar a l�gica abaixo
//        int a = 10;
//        int b = 0;
//        if(b!=0){
//            int c = a/b;
//            System.out.println(c);
    }


}

