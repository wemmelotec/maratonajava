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
        Aqui eu tenho duas Threads que estão acessando a mesma instancia, ou objeto, ao mesmo tempo.
        E isso pode gerar um problema de sacar deixando a conta negativa.
         */
        Thread william = new Thread(contaTest,"william");
        Thread ana = new Thread(contaTest,"ana");

        william.start();
        ana.start();
    }
    /*
    Para resolver o proble acima relatado da conta ficar negativa, apenas uma Thread pode acessar esse método saque por vez
    E isso é feito adicionando o atributo synchronized ao método, isso garante a atomicidade do método, durante a execução da thread
    Esse synchronized só pode ser utilizado em métodos ou em blocos, não pode em atributos ou classes
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
