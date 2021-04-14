package br.com.abc.javacore.generics.test;

import br.com.abc.javacore.generics.classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericTest {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um m�s");
        carroAlugavel.devolverCarro(carroAlugado);

        /*
        agora imagine que voc� queira fazer o mesmo para Computadores
        voc� ter� que criar uma classe Computador
        voc� ter� que criar uma classe ComputadorAlugavel
        para resolver isso vamos trabalhar com classes gen�ricas em ClasseGenericTest2
         */
    }
}
class CarroAlugavel{
    private List<Carro> carrosDisponiveis = new ArrayList<>();
    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }
    //alugar
    public Carro getCarroDisponivel(){
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + c);
        System.out.println("Carros dispon�veis: " + carrosDisponiveis);
        return c;
    }
    public void devolverCarro(Carro c){
        System.out.println("Devolvendo carro: "+ c);
        carrosDisponiveis.add(c);
        System.out.println("Carros dispon�veis: " + carrosDisponiveis);
    }
}