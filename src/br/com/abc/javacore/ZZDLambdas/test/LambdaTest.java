package br.com.abc.javacore.ZZDLambdas.test;

import br.com.abc.javacore.ZZDLambdas.classes.Carro;
import br.com.abc.javacore.ZZDLambdas.interfaces.CarroPredicate;

/*
O lambda foi criado para acabar com a verbosidade no Java
O que � uma lambda? � anonima, � uma fun��o, pode ser passada por a� (como parametro ou numa variavel), e � concisa.
Ela � dividida em tr�s partes par�metro, seta e o corpo
Quando podemos utilizar lambdas? S� pode ser utilizada em interfaces funcionais (que s� tem um m�todo abastrato).
Obs, pode ser que vejamos outros m�todo como o nome default � uma interface funcional, isso porque com esse default
a classe concreta n�o necessariamente tem a obriga��o de implementar esse m�todo

O que � programa��o funcional?
� quando voc� passa o comportamento que voc� deseja para o m�todo atrav�s da utiliza��o de interfaces funcionais
 */
public class LambdaTest {
    public static void main(String[] args) {
    //utilizando classes anonimas para verificar se um carro � ver
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
