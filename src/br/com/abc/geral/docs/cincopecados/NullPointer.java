package br.com.abc.geral.docs.cincopecados;

import java.util.Objects;
import java.util.Optional;

public class NullPointer {

    public static void main(String[] args) {

        String texto = "teste";
        //System.out.println(texto.length()); //Null Pointer Exception

        //Primeiro tratamento
        if(texto != null){
            System.out.println(texto.length());
        } else {
            System.out.println("Texto é null");
        }

        //Segundo tratamento
        String resultado = Optional.ofNullable(texto).orElse("Valor padrão");
        System.out.println(resultado);

        //Terceiro tratamento
        texto = Objects.requireNonNull(texto, "Terceiro tratamento");
        System.out.println(texto);
    }
}
