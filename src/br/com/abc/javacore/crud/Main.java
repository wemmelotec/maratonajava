package br.com.abc.javacore.crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Departamento departamento01 = new Departamento(1,"Rh");
//        Funcionario funcionario01 = new Funcionario(001,"Wellington");
//        Funcionario funcionario02 = new Funcionario(002,"Silvana");
//        Funcionario funcionario03 = new Funcionario(003,"Gustavo");
//        Funcionario funcionario04 = new Funcionario(004,"Laura");
//
//        departamento01.adicionarFuncionario(funcionario01);
//        departamento01.adicionarFuncionario(funcionario02);
//        departamento01.adicionarFuncionario(funcionario03);
//        departamento01.adicionarFuncionario(funcionario04);
//
//        //System.out.println(departamento01.toString());
//        System.out.println(funcionario01.toString());
        ArrayList<Departamento> departamentos = new ArrayList<>();
        Departamento dep1 = new Departamento(1,"RH");
        Departamento dep2 = new Departamento(2,"TI");
        departamentos.add(dep1);
        departamentos.add(dep2);

        int opcaoDoUsuario;
        Scanner input = new Scanner(System.in);
       do{
           System.out.println("*****MENU DO CRUD*****");
           System.out.println("1 - Novo.");
           System.out.println("2 - Excluir.");
           System.out.println("3 - Sair.");
           System.out.print("\nEscolha uma das opções: ");
           opcaoDoUsuario = input.nextInt();
           switch (opcaoDoUsuario){
               case 1:
                   Funcionario funcionario = new Funcionario();
                   Scanner input2 = new Scanner(System.in);
                   System.out.print("Informe o nome do funcionário: ");
                   funcionario.setNomeFuncionario(input2.next());
                   System.out.print("Informe o cpf do funcionário: ");
                   funcionario.setCpfDoUsuario(input2.next());
                   System.out.println("Abaixo segue a lista de departamentos cadastrados: ");
                   for (Departamento x: departamentos) {
                       System.out.println(x.toString());
                   }
                   System.out.print("Informe o código referente ao departamento da lista acima: ");
                   Scanner input3 = new Scanner(System.in);
                   int codigoDepartamento = input3.nextInt();
                   switch (codigoDepartamento){
                       case 1: funcionario.setDepartamentoDoFuncionario(dep1);
                       break;
                       case 2: funcionario.setDepartamentoDoFuncionario(dep2);
                       break;
                       default:break;
                   }
                   break;
               case 2:
                   System.out.println("Chame o método excluir.");
                   break;
               case 3:
                   System.out.println("Finalizando o programa");
                   break;
               default:
                   System.out.println("Opção inválida");
           }
       }while(opcaoDoUsuario!=3);

       
    }
}
