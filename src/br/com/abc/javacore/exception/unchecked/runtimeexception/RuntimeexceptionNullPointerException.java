package br.com.abc.javacore.exception.unchecked.runtimeexception;
//Outro erro em tempo de execu��o
public class RuntimeexceptionNullPointerException {
    public static void main(String[] args) {
        //Object o = null;
        //System.out.println(o.toString());
        /*
        O NullPointerException ocorreu por eu ter chamado um m�todo da vari�vel de refer�ncia o, sem ter instaciando
        um objeto nela, importante, quem executado o m�todo � sempre o objeto e n�o a vari�vel de refer�ncia
         */

        int[] a = new int[2];
        System.out.println(a[2]);
        /*
        Outro tipo de erro em tempo de execu��o
        ArrayIndexOutOfBoundsException, tentei acessar um posi��o que n�o existe no array
         */

        /*
        Por que eu chamo de exce��o em tempo de execu��o?
        Por mais que eu tenha criado a l�gica errada, a JVM vai me permitir compilar o c�digo e executar
        e a� sim o erro vai acontecer
         */

    }
}
