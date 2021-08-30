package br.com.abc.javacore.ZZCcomportamentoporparametro.test;

import br.com.abc.javacore.ZZCcomportamentoporparametro.classes.Carro;
import br.com.abc.javacore.ZZCcomportamentoporparametro.interfaces.CarroPredicate;
import br.com.abc.javacore.ZZCcomportamentoporparametro.predicates.CarrosCorVerdePredicate;
import br.com.abc.javacore.ZZCcomportamentoporparametro.predicates.CarrosDezAnosRecentePredicate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

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
    //agora suponha que o cliente queira filtrar carros vermelhos, nunca copie e cole o método e renomei
    //pois você é um aluno devdojo

    //esse método seria uma opção
    private static List<Carro> filtrarCarrosPorCor(List<Carro> carros, String cor) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equalsIgnoreCase(cor)) {
                result.add(carro);
            }
        }
        return result;
    }

    //o cliente agora que um filtro dos carros dos últimos dez anos
    private static List<Carro> filtrarCarrosUltimosDezAnos(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            //essa linha pega o ano corrente
            if (carro.getAno() > Calendar.getInstance().get(Calendar.YEAR) - 10) {
                result.add(carro);
            }
        }
        return result;
    }

    /*
    Observe que nos três métodos acima, a única coisa que muda neles é a condição o if, então dá para melhorar isso
    Para resolver isso vamos criar uma interface e um predicate que utilizará do padrão de projeto Strategy e o método abaixo
     */
    public static List<Carro> filtrarCarros(List<Carro> carros, CarroPredicate carroPredicate) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carroPredicate.test(carro)) {
                result.add(carro);
            }
        }
        return result;
    }

    //ou também podemos criar um método totalmente genérico
    public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Carro> carros = asList(new Carro("verde", 2011),
                new Carro("vermelho", 1995),
                new Carro("preto", 2017));

        //implementando a filtragem de carros verdes na lista existente
        //System.out.println(filtrarCarrosVerdes(carros));

        //implementação do segundo método
        //System.out.println(filtrarCarrosPorCor(carros,"vermelho"));

        //implementação por ano
        //System.out.println(filtrarCarrosUltimosDezAnos(carros));

        //implementando o carro predicate e parametrizando comportamentos
        //System.out.println(filtrarCarros(carros, new CarrosCorVerdePredicate()));
        //System.out.println(filtrarCarros(carros, new CarrosDezAnosRecentePredicate()));

        //ou você em vez de criar essas classes CarrosCorVerdePredicate e CarrosDezAnosRecentePredicate
        //você pode criar com uma classe anonima (que é uma interface)
//        System.out.println(filtrarCarros(carros, new CarroPredicate() {
//            @Override
//            public boolean test(Carro carro) {
//                return carro.getCor().equalsIgnoreCase("verde");
//            }
//        }));

        //implementação do método genérico
        System.out.println(filtrar(carros, new Predicate<Carro>() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equalsIgnoreCase("verde");
            }
        }));

    }
}
