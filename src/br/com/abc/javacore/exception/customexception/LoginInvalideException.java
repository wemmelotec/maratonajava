package br.com.abc.javacore.exception.customexception;

/*
essa � uma classe que cria uma Exception customizada
 */
public class LoginInvalideException extends Exception{

    public LoginInvalideException(){
        super("Usu�rio ou senha inv�lidos");
    }
}
