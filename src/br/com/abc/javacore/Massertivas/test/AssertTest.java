package br.com.abc.javacore.Massertivas.test;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-1000);
    }
    private static void calculaSalario(double salario){
        //eu sei que o sal�rio n�o pode ser negativo
        assert (salario>0);//implica que voc� tem certeza que isso ser� verdadeiro, caso contr�tio ele gera um erro

        /*
        quando eu colocar esse c�digo em produ��o a JVM vai ignorar a linha de c�digo que tem o assert
         */
    }
}
