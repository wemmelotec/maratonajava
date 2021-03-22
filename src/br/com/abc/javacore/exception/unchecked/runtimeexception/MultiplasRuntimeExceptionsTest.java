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
        regra para multiplas exce��es
        sempre coloque a mais gen�rica para baixo, caso contr�rio, ela ir� deixa as outras unrecheable
        em nosso exemplo a mais gen�rica � a RuntimeException
         */
    }
}
