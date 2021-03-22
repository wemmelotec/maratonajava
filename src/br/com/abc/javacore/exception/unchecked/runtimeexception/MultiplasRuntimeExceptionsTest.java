package br.com.abc.javacore.exception.unchecked.runtimeexception;

public class MultiplasRuntimeExceptionsTest {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
        /*
        regra para multiplas exceções
        sempre coloque a mais genérica para baixo, caso contrário, ela irá deixa as outras unrecheable
        em nosso exemplo a mais genérica é a RuntimeException
         */
    }
}
