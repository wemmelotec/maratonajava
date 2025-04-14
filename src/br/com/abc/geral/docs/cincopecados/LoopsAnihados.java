package br.com.abc.geral.docs.cincopecados;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LoopsAnihados {

    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Carol","Daniel");
        //List<String> filtrados = new ArrayList<>();
        /**
        for(String nome: nomes){
            if(nome.startsWith("A")){
                filtrados.add(nome);
            }
        }

        System.out.println(filtrados); **/

        List<String> filtrados = nomes.stream().filter(nome -> nome.startsWith("A")).collect(Collectors.toList());
        System.out.println(filtrados);

        List<String> capitalizados = nomes.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(capitalizados);


    }
}
