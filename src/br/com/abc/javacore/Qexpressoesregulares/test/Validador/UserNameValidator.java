package br.com.abc.javacore.Qexpressoesregulares.test.Validador;

public class UserNameValidator {
    /*
        * The username pode ter entre 8 e 30 caracters
        * The username pode ter alfanuméricos e o _
        * A primeira letra do username deve ter apenas letras
     */
    public static final String regularExpression = "^[A-Z][a-zA-Z0-9_]{7,29}$";
}
