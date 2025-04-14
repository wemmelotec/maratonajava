package br.com.abc.geral.docs.cincopecados;

public class BadExceptionHandling {
    public static void main(String[] args) {

        try{
            int resultado = 10/0;
        }catch (Exception e){
            //Engolindo a Exceção
        }
    }
}
