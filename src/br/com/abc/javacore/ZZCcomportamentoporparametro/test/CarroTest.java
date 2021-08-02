package br.com.abc.javacore.ZZCcomportamentoporparametro.test;

import br.com.abc.javacore.ZZCcomportamentoporparametro.classes.Carro;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class CarroTest {

    //suponha que o cliente precise buscar por carros verdes, criei esse método
    private static List<Carro> filtrarCarrosVerdes(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equalsIgnoreCase("verde")) {
                result.add(carro);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Carro> carros = asList(new Carro("verde", 2011),
                new Carro("vermelho", 1995),
                new Carro("preto", 2017));

        //implementando a filtragem de carros verdes na lista existente
        System.out.println(filtrarCarrosVerdes(carros));
        //parei aos 5:29 m
    }
}
