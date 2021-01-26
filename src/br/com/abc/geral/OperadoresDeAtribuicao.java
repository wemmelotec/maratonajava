package br.com.abc.geral;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1000;
        //salario = salario + 1000;
        salario += 1000;
        System.out.println(salario);

        //status = idade < 18 ? <true> : <false>;
        String status = 20<18? "adulto": "criança";
        System.out.println(status);
    }

}
