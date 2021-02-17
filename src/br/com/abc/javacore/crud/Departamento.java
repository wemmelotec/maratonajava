package br.com.abc.javacore.crud;

import java.util.ArrayList;

public class Departamento {
    private int codigoDepartamento;
    private String nomeDepartamento;
    private ArrayList<Funcionario> listaDeFuncionariosDesteDepartamento;

    public Departamento() {
        listaDeFuncionariosDesteDepartamento = new ArrayList<>();
    }

    public Departamento(int codigoDepartamento, String nomeDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
        this.nomeDepartamento = nomeDepartamento;
        listaDeFuncionariosDesteDepartamento = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Codigo = " + codigoDepartamento +
                "\t Nome do departamento = " + nomeDepartamento;
    }


    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public ArrayList<Funcionario> getListaDeFuncionariosDesteDepartamento() {
        return listaDeFuncionariosDesteDepartamento;
    }

    public void setListaDeFuncionariosDesteDepartamento(ArrayList<Funcionario> listaDeFuncionariosDesteDepartamento) {
        this.listaDeFuncionariosDesteDepartamento = listaDeFuncionariosDesteDepartamento;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionario.setDepartamentoDoFuncionario(this);
        listaDeFuncionariosDesteDepartamento.add(funcionario);
    }
}
