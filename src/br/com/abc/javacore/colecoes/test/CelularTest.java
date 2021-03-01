package br.com.abc.javacore.colecoes.test;

import br.com.abc.javacore.colecoes.classes.Celular;

public class CelularTest {
    public static void main(String[] args) {
        Celular c1 = new Celular("wellington","123");
        Celular c2 = new Celular("Wellington", "123");

        //se eu comparar com o equals que eu fiz na classe celular comentado vai resultar false
        System.out.println(c1.equals(c2));
        //se eu compara com o equals que eu fiz na classe implementado o resultado vai ser true

        /*
        implementei o equals para verificar se o IMEI é o mesmo

        o equals da classe object, compara apenas o endereço de memória do objeto e não o conteúdo
         */
    }
}
