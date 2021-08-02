package br.com.abc.javacore.Dsobrecargaconstrutores.classes;

/*-----------------------------*\
 *About sobrecarga construtores*					
/*-----------------------------*/
public class Estudante {

	private String matricula;
	private String nome;
	private double[] notas;

	private String dataMatricula;

	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}

	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
		// forma especial de chamar o primeiro construtor
		this(matricula, nome, notas);
		this.dataMatricula = dataMatricula;
	}

	// overload no construtor de Estudante
	// para não forçar o construtor a exigir os parâmetros
	public Estudante() {
		System.out.println("Construtor default");
	}

	public void imprime() {
		System.out.println(this.matricula);
		System.out.println(this.nome);
		for (double aux : this.notas) {
			System.out.println(aux);
		}
		System.out.println(this.dataMatricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	

}
