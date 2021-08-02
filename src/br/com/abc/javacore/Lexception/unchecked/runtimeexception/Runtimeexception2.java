package br.com.abc.javacore.Lexception.unchecked.runtimeexception;

public class Runtimeexception2 {
    public static void main(String[] args) {

        divisao(10,0);
    }
    public static void divisao(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Passe um valor diferente de 0 para num 2");
        }
        int result = num1/num2;
        System.out.println(result);
    }
    /*
    no método divisao como eu sei que uma divisão por 0 causaria um ArithmeticException
    eu mesmo posso criar um lançamento, para o argumento que foi enviado errado
     */
}
