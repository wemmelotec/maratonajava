package br.com.abc.javacore.threads.classes;

/*
Esse será a thread que vai trabalhar diretamente com a lista de membros
 */
public class Entregador implements Runnable {
    private ListaMembros listaMembros; //isso é uma associação com a classe ListaMembros

    public Entregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + " Começando o trabalho de entrega");
        int quantidadePendente = listaMembros.getEmailsPendentes();
        boolean aberta = listaMembros.isAberta();
        while (aberta || quantidadePendente > 0) {
            try {
                String email = listaMembros.obterEmailMembro();
                if (email != null) {
                    System.out.println(nomeThread + "enviando e-mail para " + email);
                    Thread.sleep(2000);
                    System.out.println("Envio para " + email + "concluido com sucesso");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            aberta = listaMembros.isAberta();
            quantidadePendente = listaMembros.getEmailsPendentes();
        }
        System.out.println("Atividades finalizadas");
    }
}
