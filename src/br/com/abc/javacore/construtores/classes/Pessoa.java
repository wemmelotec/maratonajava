package br.com.abc.javacore.construtores.classes;
/*----------------------------*\
 *     About construtores	  *					
/*----------------------------*/
public class Pessoa {

	String nome;
	int idade;
	double[] notas;
	/*
	 * Todo objeto em Java precisa ser construido, logo toda classe tem seu método construtor
	 * mesmo que ele não apareça no código, quando o Java vai compilar a classe ele mesmo cria
	 * o construtor.
	 */
	
	//esse é o método construtor
	public Pessoa(String nome) {
		//aqui eu posso definir algumas regras
		//se deixar em branco fica no modo default onde todos os atributos serão criados com valores padrão
		//mas eu posso solicitar também que no momento da crição ele seja obrigado a atribuir valores
		this.nome = nome;
	}
													//esse parâmetro poderia estar assim
													//double... notas
	public void preencarDados(String nome, int idade, double[] notas) {
		this.nome = nome;
		this.idade = idade;
		this.notas = notas;
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		for(double num : notas) {
			System.out.println(num);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}


}
