package br.com.abc.javacore.exception.unchecked.runtimeexception;
//Outro erro em tempo de execução
public class RuntimeexceptionNullPointerException {
    public static void main(String[] args) {
        //Object o = null;
        //System.out.println(o.toString());
        /*
        O NullPointerException ocorreu por eu ter chamado um método da variável de referência o, sem ter instaciando
        um objeto nela, importante, quem executado o método é sempre o objeto e não a variável de referência
         */

        int[] a = new int[2];
        System.out.println(a[2]);
        /*
        Outro tipo de erro em tempo de execução
        ArrayIndexOutOfBoundsException, tentei acessar um posição que não existe no array
         */

        /*
        Por que eu chamo de exceção em tempo de execução?
        Por mais que eu tenha criado a lógica errada, a JVM vai me permitir compilar o código e executar
        e aí sim o erro vai acontecer
         */

    }
}
