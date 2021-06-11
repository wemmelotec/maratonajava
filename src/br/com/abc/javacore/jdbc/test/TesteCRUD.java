package br.com.abc.javacore.jdbc.test;

import br.com.abc.javacore.jdbc.classes.Comprador;

import java.util.Scanner;

public class TesteCRUD {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if (op == 6) {
                System.out.println("Saindo do sistema");
                break;
            }
            executar(op);
        }
    }

    //menu
    private static void menu() {
        System.out.println("Digite a opção para começar: ");
        System.out.println("1. Inserir comprador");
        System.out.println("2. Atualizar comprador");
        System.out.println("3. Listar todos os compradores");
        System.out.println("4. Buscar comprador por nome");
        System.out.println("5. Deletar");
        System.out.println("6. Sair");
    }

    //executar
    private static void executar(int op) {
        switch (op) {
            case 1:
                inserir();
                break;
        }
    }

    public static void inserir() {
        Comprador c = new Comprador();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Cpf: ");
        c.setCpf(teclado.nextLine());
    }

}
