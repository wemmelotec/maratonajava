package br.com.abc.javacore.threads.test;

import br.com.abc.javacore.threads.classes.Conta;

/*
Aqui eu vou trabalhar o sincronismo utilizando as threads
 */
public class ContaTest implements Runnable{
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        /*
        Aqui eu tenho duas Threads que est�o acessando a mesma instancia, ou objeto, ao mesmo tempo.
        E isso pode gerar um problema de sacar deixando a conta negativa.
         */
        Thread william = new Thread(contaTest,"william");
        Thread ana = new Thread(contaTest,"ana");

        william.start();
        ana.start();
    }
    /*
    Para resolver o proble acima relatado da conta ficar negativa, apenas uma Thread pode acessar esse m�todo saque por vez
    E isso � feito adicionando o atributo synchronized ao m�todo, isso garante a atomicidade do m�todo, durante a execu��o da thread
    Esse synchronized s� pode ser utilizado em m�todos ou em blocos, n�o pode em atributos ou classes
     */
    private synchronized void saque(int valor){
        if(conta.getSaldo() >= valor){
            System.out.println(Thread.currentThread().getName()+" esta indo sacar");
            conta.saque(valor);
            System.out.println(Thread.currentThread().getName()+" completou o saque");
        }else {
            System.out.println("saldo insuficiente " + Thread.currentThread().getName() + conta.getSaldo());
        }
    }
    @Override
    public void run() {
        // cada thread vai executar 5 vezes
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo()<0){
                System.out.println("O meu Deus");
            }
        }
    }
}
