package br.com.abc.javacore.ZZCcomportamentoporparametro.predicates;

import br.com.abc.javacore.ZZCcomportamentoporparametro.classes.Carro;
import br.com.abc.javacore.ZZCcomportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > Calendar.getInstance().get(Calendar.YEAR) - 10;
    }
}
