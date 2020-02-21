package br.com.abc.introducao.controle;

public class ControleFluxo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
		// porém as parcelas não podem ser menores do que 1000

		double valorTotal = 30000;

		for (int parcela = 1; parcela <= valorTotal; parcela++) {

			double valorParcela = valorTotal / parcela;

			if (valorParcela < 1000) {
				break; //faz sair da estrutura de repetição

			} else {
				System.out.println("Parcela " + parcela + " R$ " + valorParcela);

			}

		}

	}

}
