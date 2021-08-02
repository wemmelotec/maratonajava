package br.com.abc.javacore.Lexception.checked.test;

import br.com.abc.javacore.Lexception.customexception.LoginInvalideException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalideException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalideException{
        String usuario = "Goku";
        String senha = "123";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "111";
        if(!usuario.equalsIgnoreCase(usuarioDigitado) || !senha.equalsIgnoreCase(senhaDigitada)){
            throw new LoginInvalideException();
        }else {
            System.out.println("Logado");
        }
    }
}
