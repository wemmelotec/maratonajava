package br.com.abc.geral.docs.cincopecados;

public class MutableExample {
    public static void main(String[] args) {

        //Contador contador = new Contador();
        //contador.valor++; // Isso pode causar problemas de concorr�ncia quando utilizado por threads

        Contador contadorImutavel = new Contador(10);
        System.out.println(contadorImutavel.getValor());
    }
}

class Contador {
    //pode causar problemas de concorr�ncia
    //public int valor = 0;

    //para resolver o problema de concorr�ncia
    private final int valor2;

    public Contador(int valor2){
        this.valor2 = valor2;
    }

    public int gerValor(){
        return valor2;
    }

    public int getValor() {
        return valor2;
    }
}
