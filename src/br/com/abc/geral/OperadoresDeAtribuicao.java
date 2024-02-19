package br.com.abc.geral;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        //Operadores de atribuição compostos =, -=, +=, *=, /=, %=
        int salario = 1000;
        //salario = salario + 1000;
        salario += 1;
        System.out.println(salario);

        int x = 10;
        x -= 3;
        System.out.println(x);

        int y = 4;
        y *= 2;
        System.out.println(y);

        int z = 10;
        z /= 2;
        System.out.println(z);

        int w = 10;
        z %= 3;
        System.out.println(z);

        //status = idade < 18 ? <true> : <false>;
        String status = 20<18? "adulto": "criança";
        System.out.println(status);
    }

}
