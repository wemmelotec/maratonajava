package br.com.abc.javacore.Yjdbc.test;

import br.com.abc.javacore.Yjdbc.classes.Comprador;
import br.com.abc.javacore.Yjdbc.db.CompradorDAO;

import java.util.List;
import java.util.Scanner;

public class TesteCRUD {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if (op == 0) {
                System.out.println("Saindo do sistema");
                break;
            }
            executar(op);
        }
    }

    //menu
    private static void menu() {
        System.out.println("Digite a op��o para come�ar: ");
        System.out.println("1. Inserir comprador");
        System.out.println("2. Atualizar comprador");
        System.out.println("3. Listar todos os compradores");
        System.out.println("4. Buscar comprador por nome");
        System.out.println("5. Deletar");
        System.out.println("0. Sair");
    }

    //executar
    private static void executar(int op) {
        switch (op) {
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite um nome: ");
                listarPorNome(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;
        }
    }

    public static void inserir() {
        Comprador c = new Comprador();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Cpf: ");
        c.setCpf(teclado.nextLine());
        CompradorDAO.save(c);
    }

    public static void atualizar() {
        System.out.println("Selecione um dos compradores abaixo: ");
        List<Comprador> compradorList = listar();
        Comprador c = compradorList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou enter para manter o mesmo:");
        String nome = teclado.nextLine();
        System.out.println("Novo cpf ou enter para manter o mesmo: ");
        String cpf = teclado.nextLine();
        if (!nome.isEmpty()) {
            c.setNome(nome);
        }
        if (!cpf.isEmpty()) {
            c.setCpf(cpf);
        }
        CompradorDAO.update(c);
    }

    public static List<Comprador> listar() {
        List<Comprador> compradorList = CompradorDAO.selectAll();
        for (int i = 0; i < compradorList.size(); i++) {
            Comprador c = compradorList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + ": " + c.getCpf());

        }
        return compradorList;
    }

    public static void listarPorNome(String nome) {
        List<Comprador> compradorList = CompradorDAO.searchByName(nome);
        for (int i = 0; i < compradorList.size(); i++) {
            Comprador c = compradorList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + ": " + c.getCpf());
        }

    }

    public static void deletar() {
        System.out.println("Selecione um dos compradores para deletar: ");
        List<Comprador> compradorList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza? S/N");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            CompradorDAO.delete(compradorList.get(index));
        }
    }
}
