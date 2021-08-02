package br.com.abc.javacore.threads.classes;

import java.util.LinkedList;
import java.util.Queue;

/*
Classe utilizada para criar um programa que gerencia convites e explicar o wait, notify w notifyall, para comunicação entre threads
 */
public class ListaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private boolean aberta = true;

    public int getEmailsPendentes() {
        synchronized (emails) {
            return this.emails.size();
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public String obterEmailMembro() {
        String email = null;
        try {
            synchronized (this.emails) {
                while (this.emails.size() == 0) {
                    if (!aberta) return null;
                    System.out.println("Lista vazia, colocando a thread: " + Thread.currentThread().getName() + " em modo wait");
                    this.emails.wait();
                }
                email = this.emails.poll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return email;
    }

    public void adicionarEmailMembro(String email) {
        synchronized (this.emails) {
            this.emails.add(email);
            System.out.println("Email adicionado a lista");
            System.out.println("Notificando as thread que estão em espera");
            this.emails.notifyAll();
        }
    }

    public void fecharLista() {
        System.out.println("Notificando todas as threads e fechando a lista");
        aberta = false;
        synchronized (this.emails) {
            this.emails.notifyAll();
        }
    }
}
