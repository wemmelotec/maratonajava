package br.com.abc.javacore.Bintroducaometodos.classes;

public class Estudante {
	/*
	 * Fazer com que esses atributos passem por um m�todo para em seguida eles
	 * poderem ou n�o ser preenchidos dentro do objeto, isso melhora o c�digo
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
			// como esse for � um �nico bloco ele funciona como se fosse apenas uma linha
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
			System.out.println("A m�dia �: " + media + "\nReprovado");
		} else {
			this.aprovado = true;
			System.out.println("A m�dia �: " + media + "\nAprovado");
		}

	}

	// j� no get eu quero um retorno, por isso ele tem que ser do tipo que eu estou
	// pedindo
	public String getNome() {
		return this.nome;
	}

	// como n�o preciso de retorno no set fica void
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		if (idade <= 0) {
			System.out.println("A idade n�o pode ser menor ou igual a 0");
			// esse return serve para o caso de entrar nesse if ele n�o passar para a linha
			// 67
			// ele faz o if e sai do m�todo
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

	// para boolean n�o utilizamos o get e sim o is
	public boolean isAprovado() {
		return aprovado;
	}

}
