package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante joao = new Estudante();
/*joao � uma variavel de refer�ncia do tipo estudante = objeto do tipo estudante
mas a frente poderemos observar que isso n�o � uma redund�ncia por conta do polimorfismo
pois � poss�vel ter uma variavel de referencia de um tipo apontando para um objeto de outro tipo
*/		
		joao.nome="Joao";
		joao.matricula=1212;
		joao.idade=15;
		
		System.out.println(joao.nome);
		System.out.println(joao.matricula);
		System.out.println(joao.idade);
	}
}
