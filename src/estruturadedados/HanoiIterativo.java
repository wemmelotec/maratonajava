package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class HanoiIterativo {
    // pilha de comandos que substitui as chamadas recursivas
    private static Stack<String> pilha = new Stack<String>();

    // armazena o n�mero no movimento atual
    private static long numMov;

    // M�todo que realiza (imprime) o movimento
    // de um disco entre dois pinos
    private static void mover(int O, int D) {
        numMov++;
        System.out.println("[" + numMov + "]:" + O + " -> " + D);
    }

    // m�todo que implementa o algoritmo hanoi iterativo
    public static void hanoi(int n) {

        int O = 1; // pino origem
        int D = 3; // pino destino
        int T = 2; // pino trabalho

        // monta e empilha o primeiro comando
        String comandoAtual = n + "," + O + "," + D + "," + T;

        pilha.push(comandoAtual);

        // o jogo chega ao fim quando a pilha de comandos estiver vazia!
        while (!pilha.empty()) {

            // quando n > 1, devemos empilhar um novo comando
            if (n > 1) {

                // monta o novo comando a ser empilhado
                n--;
                String[] vetAux = comandoAtual.split(",");
                O = Integer.parseInt(vetAux[1]);
                D = Integer.parseInt(vetAux[2]);
                T = Integer.parseInt(vetAux[3]);

                // isto seria uma chamada recursiva...
                comandoAtual = n + "," + O + "," + T + "," + D;

                // empilha o novo comando
                pilha.push(comandoAtual);

                // caso contr�rio, devemos desempilhar
                // e executar um movimento
            } else {

                //desempilha um comando
                comandoAtual = pilha.pop();

                // separa n, origem, destino e trabalho
                String[] vetAux = comandoAtual.split(",");
                n = Integer.parseInt(vetAux[0]);
                O = Integer.parseInt(vetAux[1]);
                D = Integer.parseInt(vetAux[2]);
                T = Integer.parseInt(vetAux[3]);

                // executa movimento
                mover(O, D);

                // quando n > 1, � preciso empilhar
                // um comando depois do movimento
                if (n > 1) {
                    n--;
                    // isto seria uma chamada recursiva...
                    comandoAtual=n + "," + T + "," + D + "," + O;
                    pilha.push(comandoAtual);
                }

            }

        }

    }

    // m�todo main para restar o programa!
    public static void main(String[] args) {

        int n; // n�mero de discos

        // recebe o n�	mero de discos digitado pelo usu�rio
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o n�mero de discos: ");
        n = entrada.nextInt();

        // executa o algoritmo iterativo das Torres de Han�i
        HanoiIterativo.hanoi(n);

    }
}
