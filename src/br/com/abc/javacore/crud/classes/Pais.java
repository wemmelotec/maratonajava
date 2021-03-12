package br.com.abc.javacore.crud.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pais {
    private List<Estado> estados = new ArrayList<>();



    public void adicionaEstado(Estado e){
        if(estados.contains(e)){
            System.out.println("Este estado já foi adicionado anteriormente!");
        }else {
            estados.add(e);
            System.out.println("O estado "+ e + " foi adicionado.");
        }
    }
    public void adicionarEstadoComIndex(int i,Estado e){
        estados.add(i,e);
    }
    public boolean consultaEstado(Estado e){
        if(estados.contains(e)){
            System.out.println("Este estado existe");
            return true;
        }else{
            System.out.println("Este estado não foi cadastrado");
            return false;
        }
    }

    public void atualizaNome(Estado e){
        if(consultaEstado(e)){
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o novo nome do estado: ");
            e.setName(input.next());
        }
    }
    public List<Estado> ordenaListaDosEstados(){
        Collections.sort(estados);
        return estados;
    }
    //BinarySearch
    public int buscaBinaria(Estado estado){
        return Collections.binarySearch(estados,estado);
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
}
