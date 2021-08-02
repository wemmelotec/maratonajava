package br.com.abc.javacore.Csobrecargametodos.classes;
/*----------------------------*\
 *About sobrecarga de método  *					
/*----------------------------*/
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	/*
	 * Esse atríbuto rg foi acrescentado posteriormente para simular um ambiente de overload
	 */
	private String rg;
	
	//deixando um construtor explicito (lembrando que o Java ja faz na compilação)
	//1 regra nuca um construtor tem retorno
	
	public Funcionario(String nome) {
		//meu funcionario obrigatóriamente tem que ter um nome
		this.nome = nome;
	}
		
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.salario);
		System.out.println(this.rg);
	}
	
	public void init(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	//sobre carga do método init (o nome pode ser o mesmo, mas os parametros tem que ser diferentes)
	public void init(String nome, String cpf, double salario,String rg) {
		init(nome, cpf, salario);
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
}
