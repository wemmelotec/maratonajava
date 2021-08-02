package br.com.abc.javacore.Vcolecoes.test;

public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "Wellington";
        String nome2 = "Wellington";
        System.out.println(nome1==nome2);
        /*
        true, pois quando criamos String dessa forma, o objeto vai para o pool de String e se você tem duas String
        iguais, significa que as duas variáveis de referência, estão apontando para o mesmo objeto.
         */
        String nome3 = new String("Wellington");
        System.out.println(nome1==nome3);
        /*
        false, pois apesar deles serem significativamente identicos, eles estão em locais diferentes, pois quando eu crio
        a String com o new, eu crio o objeto no RIP, então com os dois objetos apesar de serem iguais, estão em referências
        de memória diferentes, a == sempre vai ser false
         */
        Integer int1 = 5;
        Integer int2 = new Integer(5);
        System.out.println(int1==int2);
        //Podemos observar que a mesma coisa acontece com as classe Wrappers

        //Então para comparar o significado do objeto e não o endereço de memória,
        //implementamos(sobreescrevemos) o equals utilizando o atributo identificador da classe
        System.out.println(nome1.equals(nome3));
        System.out.println(int1.equals(int2));
    }
}
