package br.com.abc.geral;

public class CalculaAlicotaInss {
    public static void main(String[] args) {
        double salario = 2700;
        double desconto;

        if (salario <= 1412.00) {
            desconto = 0;
            System.out.println(salario);
        } else if (salario > 1412.00 && salario <= 2666.68) {
            desconto = 0.09 * salario;
            System.out.println(salario - desconto);
        } else if (salario > 2666.68 && salario <= 4000.03) {
            desconto = 0.12 * salario;
            System.out.println(salario - desconto);
        } else {
            desconto = 0.14 * salario;
            System.out.println(salario - desconto);
        }
    }
}
