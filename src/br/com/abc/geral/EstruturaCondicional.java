package br.com.abc.geral;

public class EstruturaCondicional {
    public static void main (String[] Args){
        int idade = 20;

        if(idade < 15){
            System.out.println("Categoria infantil");
        } else if(idade >=15 && idade<18){
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulto");
        }
    }
}
