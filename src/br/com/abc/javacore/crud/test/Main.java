package br.com.abc.javacore.crud.test;

import br.com.abc.javacore.crud.classes.Estado;
import br.com.abc.javacore.crud.classes.Pais;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais();
        Estado e1 = new Estado("Paraiba");
        Estado e2 = new Estado("Paraiba");
        Estado e3 = new Estado("Pernambuco");
        Estado e4 = new Estado("Rio Grande do Norte");
        Estado e5 = new Estado("Alagoas");
        System.out.println("*****Create*****");
        brasil.adicionaEstado(e1);
        brasil.adicionaEstado(e2);
        brasil.adicionaEstado(e3);
        brasil.adicionaEstado(e4);
        brasil.adicionaEstado(e5);
        System.out.println("Lista após o create");
        for (Estado e: brasil.getEstados()) {
            System.out.println(e.getName());
        }
//        System.out.println("*****Delete*****");
//        brasil.getEstados().remove(e4);
//        System.out.println("Lista após o delete");
//        for (Estado e: brasil.getEstados()) {
//            System.out.println(e.getName());
//        }
//        System.out.println("*****Retrievel*****");
//        brasil.consultaEstado(e1);
//        brasil.consultaEstado(e4);
//        System.out.println("*****Update*****");
//        brasil.atualizaNome(e1);
//        System.out.println("Lista após o update");
//        for (Estado e: brasil.getEstados()) {
//            System.out.println(e.getName());
//        }
//        System.out.println("*****Ordenar*****");
        //ordenação
        System.out.println("******");
        brasil.ordenaListaDosEstados();
        for (Estado e: brasil.getEstados()) {
            System.out.println(e.getName());
        }
        System.out.println("***Busca binária***");
        System.out.println(brasil.buscaBinaria(e3));
        Estado e6 = new Estado("Ceara");
        System.out.println(brasil.buscaBinaria(e6));//-(-2) -1 = 2-1 = 1 esse é o indice da posição que deve ser asicionado o objeto e6 para manter a ordem
        brasil.adicionarEstadoComIndex(1, e6);
        for (Estado e: brasil.getEstados()) {
            System.out.println(e.getName());
        }
    }
}
