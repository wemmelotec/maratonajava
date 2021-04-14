package br.com.abc.javacore.generics.test;

import br.com.abc.javacore.generics.classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericTest2 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por um mês");
        carroAlugavel.devolverObjeto(carro);
        /*
        com essa classe generica eu não preciso mais criar xxxxAlugaveis para cada tipo
         */
    }
}
class ObjetosAlugaveis<T>{
    private List<T> objetosDisponiveis;
    public ObjetosAlugaveis(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }
    public T getObjetoDisponivel(){
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponíveis: " + objetosDisponiveis);
        return t;
    }
    public void devolverObjeto(T t){
        System.out.println("Devolvendo objeto: "+ t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis: " + objetosDisponiveis);
    }
}
