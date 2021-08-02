package br.com.abc.javacore.Massertivas.test;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-1000);
    }
    private static void calculaSalario(double salario){
        //eu sei que o salário não pode ser negativo
        assert (salario>0);//implica que você tem certeza que isso será verdadeiro, caso contrátio ele gera um erro

        /*
        quando eu colocar esse código em produção a JVM vai ignorar a linha de código que tem o assert
         */
    }
}
