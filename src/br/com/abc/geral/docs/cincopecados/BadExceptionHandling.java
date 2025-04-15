package br.com.abc.geral.docs.cincopecados;

public class BadExceptionHandling {
    public static void main(String[] args) {

        try{
            int resultado = 10/0;
        }catch (Exception e){
            //Engolindo a Exceção
            //Primeiro momento sem nenhum tratamento

            //Segundo momento tratando pela minha class MinhaExcecao
            System.out.println("Erro" + e.getMessage());
        }
    }
}

class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem){
        super(mensagem);
    }
}