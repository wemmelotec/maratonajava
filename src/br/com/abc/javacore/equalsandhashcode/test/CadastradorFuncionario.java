package br.com.abc.javacore.equalsandhashcode.test;

import br.com.abc.javacore.equalsandhashcode.classe.Funcionario;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Scanner;

public class CadastradorFuncionario {
    public static void main(String[] args) {
        Collection<Funcionario> listaDeFuncionarios = new ArrayDeque<>();
        System.out.println("********Cadastro de funcionários*********");
        Scanner entrada = new Scanner(System.in);
        String continuar = "s";

        while ("s".equalsIgnoreCase(continuar)) {
            System.out.print("CPF: ");
            String cpfInformado = entrada.next();

            System.out.print("Nome: ");
            String nomeInformado = entrada.next();

            Funcionario funcionario = new Funcionario(cpfInformado,nomeInformado);

            if (listaDeFuncionarios.contains(funcionario)){
                System.out.println("Esse funcionário já existe.");
            }else {
                listaDeFuncionarios.add(funcionario);
                System.out.println("O Funcionário foi adicionado.");
            }
            System.out.println("Deseja cadastrar outro funcionário? (s/n)");
            continuar = entrada.next();
        }
        listaDeFuncionarios.forEach(System.out::println);
        System.out.println("Fim");
    }
}
