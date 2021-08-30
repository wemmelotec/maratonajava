package br.com.abc.javacore.ZZDLambdas.test;

import br.com.abc.javacore.ZZDLambdas.classes.Carro;
import br.com.abc.javacore.ZZDLambdas.interfaces.CarroPredicate;

/*
O lambda foi criado para acabar com a verbosidade no Java
O que é uma lambda? é anonima, é uma função, pode ser passada por aí (como parametro ou numa variavel), e é concisa.
Ela é dividida em três partes parâmetro, seta e o corpo
Quando podemos utilizar lambdas? Só pode ser utilizada em interfaces funcionais (que só tem um método abastrato).
Obs, pode ser que vejamos outros método como o nome default é uma interface funcional, isso porque com esse default
a classe concreta não necessariamente tem a obrigação de implementar esse método

O que é programação funcional?
É quando você passa o comportamento que você deseja para o método através da utilização de interfaces funcionais
 */
public class LambdaTest {
    public static void main(String[] args) {
    //utilizando classes anonimas para verificar se um carro é ver
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equalsIgnoreCase("verde");
            }
        };
        System.out.println(carroPredicate.test(new Carro("azul", 2011)));

    //utilizando lambda
    CarroPredicate carroPredicate1 = (Carro carro) -> carro.getCor().equalsIgnoreCase("verde");
        System.out.println(carroPredicate.test(new Carro("azul", 2011)));
    }
}
