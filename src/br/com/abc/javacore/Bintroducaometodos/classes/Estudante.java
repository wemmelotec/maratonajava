package br.com.abc.javacore.Bintroducaometodos.classes;

public class Estudante {
	/*
	 * Fazer com que esses atributos passem por um método para em seguida eles
	 * poderem ou não ser preenchidos dentro do objeto, isso melhora o código
	 * diminuindo o acoplamento. Para fazer isso temos que alterar o modificador de
	 * acesso de public para outros.
	 */
	private String nome;
	private int idade;
	private double[] notas;
	private boolean aprovado;

	public void imprimirDados() {
		System.out.println("Nome do Aluno: " + this.nome);
		System.out.println("Idade do Aluno: " + this.idade);
		if (this.notas != null)
			// como esse for é um único bloco ele funciona como se fosse apenas uma linha
			for (double nota : this.notas) {
				System.out.println("Nota: " + nota);
			}
		else
			System.out.println("Preecha os campos notas");
	}

	public void tirarMedia() {
		if (this.notas == null) {
			System.out.println("Preecha os campos notas");
			return;
		}
		double media = 0;

		for (double nota : this.notas) {
			media += nota;
		}
		media = media / (this.notas.length);

		if (media <= 6) {
			this.aprovado = false;
			System.out.println("A média é: " + media + "\nReprovado");
		} else {
			this.aprovado = true;
			System.out.println("A média é: " + media + "\nAprovado");
		}

	}

	// já no get eu quero um retorno, por isso ele tem que ser do tipo que eu estou
	// pedindo
	public String getNome() {
		return this.nome;
	}

	// como não preciso de retorno no set fica void
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		if (idade <= 0) {
			System.out.println("A idade não pode ser menor ou igual a 0");
			// esse return serve para o caso de entrar nesse if ele não passar para a linha
			// 67
			// ele faz o if e sai do método
			return;
		}
		this.idade = idade;
	}

	public double[] getNotas() {
		return this.notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	// para boolean não utilizamos o get e sim o is
	public boolean isAprovado() {
		return aprovado;
	}

}
