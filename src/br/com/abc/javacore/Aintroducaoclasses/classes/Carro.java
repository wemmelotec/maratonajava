package br.com.abc.javacore.Aintroducaoclasses.classes;

public class Carro{

	public String placa;
	public String modelo;
	public float velocidadeMaxima;

	@Override
	public String toString(){
        return "Modelo "+ this.modelo + "\n" +
				"Placa "+this.placa + "\n"+
				"Velocidade Máxima"+ this.velocidadeMaxima;
    }
}
