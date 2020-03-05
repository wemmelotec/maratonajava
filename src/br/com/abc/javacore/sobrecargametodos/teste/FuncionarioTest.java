package br.com.abc.javacore.sobrecargametodos.teste;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Yuri");
		/*
		funcionario.setNome("Chica da Silva");
		funcionario.setCpf("012.801.224-20");
		funcionario.setSalario(4500);
		*/
		//em vez de tudo isso acima, posso fazer assim
		funcionario.init("Chiaca da silva", "012.801.224-20", 4500, "2638027");
		funcionario.imprime();
		
		//como não é interessante alterar as assinaturas de métodos que varias pessoas trabalham
		//a solução seria a sobrecarga de metodos

	}

}
