package br.com.abc.javacore.Lexception.customexception;

/*
essa é uma classe que cria uma Exception customizada
 */
public class LoginInvalideException extends Exception{

    public LoginInvalideException(){
        super("Usuário ou senha inválidos");
    }
}
