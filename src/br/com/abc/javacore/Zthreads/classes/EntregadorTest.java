package br.com.abc.javacore.Zthreads.classes;

import javax.swing.*;

/*
Essa � a classe main do meu programa
 */
public class EntregadorTest {
    public static void main(String[] args) {
        ListaMembros listaMembros = new ListaMembros();
        Thread t1 = new Thread(new Entregador(listaMembros), "Entregador 1");
        Thread t2 = new Thread(new Entregador(listaMembros), "Entregador 2");
        t1.start();
        t2.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Digite o e-mail do membro");
            if (email == null || email.isEmpty()) {
                listaMembros.fecharLista();
                break;
            } else {
                listaMembros.adicionarEmailMembro(email);
            }
        }
    }
}
