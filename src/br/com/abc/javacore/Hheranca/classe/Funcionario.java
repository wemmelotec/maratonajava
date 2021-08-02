package br.com.abc.javacore.Hheranca.classe;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu: " + super.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
