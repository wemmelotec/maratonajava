package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante joao = new Estudante();
/*joao é uma variavel de referência do tipo estudante = objeto do tipo estudante
mas a frente poderemos observar que isso não é uma redundância por conta do polimorfismo
pois é possível ter uma variavel de referencia de um tipo apontando para um objeto de outro tipo
*/		
		joao.nome="Joao";
		joao.matricula=1212;
		joao.idade=15;
		
		System.out.println(joao.nome);
		System.out.println(joao.matricula);
		System.out.println(joao.idade);
	}
}
