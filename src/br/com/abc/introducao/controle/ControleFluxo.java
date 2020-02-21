package br.com.abc.introducao.controle;

public class ControleFluxo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
		// por�m as parcelas n�o podem ser menores do que 1000

		double valorTotal = 30000;

		for (int parcela = 1; parcela <= valorTotal; parcela++) {

			double valorParcela = valorTotal / parcela;

			if (valorParcela < 1000) {
				break; //faz sair da estrutura de repeti��o

			} else {
				System.out.println("Parcela " + parcela + " R$ " + valorParcela);

			}

		}

	}

}
