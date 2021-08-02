package br.com.abc.javacore.Zthreads.classes;
/*
Classe utilizada para ensinar o sincronismo no código
Vai simular uma conta conjunta em que duas pessoas tentam sacar o valor total ao mesmo tempo
 */
public class Conta {
    private int saldo = 50;

    public int getSaldo(){
        return saldo;
    }

    public void saque(int valor){
        saldo = saldo - valor;
    }
}
