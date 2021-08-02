package br.com.abc.javacore.Vcolecoes.test;

import br.com.abc.javacore.Vcolecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args)  {
        Celular c1 = new Celular("Samsung", "123");
        Celular c2 = new Celular("Motorola", "423");
        Celular c3 = new Celular("LG", "598");
        Celular c4 = new Celular("LG", "598");

        List<Celular> celularList = new ArrayList<>();

        celularList.add(c1);
        celularList.add(c2);
        celularList.add(c3);

        for (Celular celular:celularList) {
            System.out.println(celular);
        }
        System.out.println("**************");

                if (celularList.contains(c4)) {
                    System.out.println("Esse objeto já existe");
                } else {
                    celularList.add(c4);
                }

        }





    }



