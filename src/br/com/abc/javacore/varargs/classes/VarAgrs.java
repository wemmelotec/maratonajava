package br.com.abc.javacore.varargs.classes;

public class VarAgrs {
    public void imprimiNomes(String... lista){
        for (String x: lista) {
            System.out.println(x);
        }
    }
}
