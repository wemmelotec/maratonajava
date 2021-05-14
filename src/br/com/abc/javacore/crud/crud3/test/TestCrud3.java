package br.com.abc.javacore.crud.crud3.test;

import br.com.abc.javacore.crud.crud3.classes.Estado;
import br.com.abc.javacore.crud.crud3.classes.Pais;

import java.util.ArrayList;
import java.util.List;

public class TestCrud3 {
    public static void main(String[] args) {
        Pais brasil = new Pais();
        Estado paraiba = new Estado("Paraíba", "PB");
        Estado pernambuco = new Estado("Pernambuco", "PE");
        Estado rio = new Estado("Rio Grande do Norte", "RN");

        add(paraiba,brasil);
        add(pernambuco,brasil);
        add(rio,brasil);
        add(rio,brasil);

        for (Estado estado:brasil.getEstados()) {
            System.out.println(estado);
        }

    }
    public static void add(Estado estado, Pais pais){
        if(pais.getEstados().contains(pais)){
            System.out.println("Este estado já foi inserido!");
        }else {
            pais.getEstados().add(estado);
        }
    }
}
