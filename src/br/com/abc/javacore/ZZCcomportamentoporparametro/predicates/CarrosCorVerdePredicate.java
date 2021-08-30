package br.com.abc.javacore.ZZCcomportamentoporparametro.predicates;

import br.com.abc.javacore.ZZCcomportamentoporparametro.classes.Carro;
import br.com.abc.javacore.ZZCcomportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equalsIgnoreCase("verde");
    }
}
