package br.com.abc.geral;

import java.util.ArrayList;
import java.util.Scanner;

public class VerificacaoLinear {
    public static void main(String[] args) {
        //cria��o do vetor
       String[] estados = new String[6];
        estados[0]="PB";
        estados[1]="PE";
        estados[2]="RN";
        estados[3]="AL";
        estados[4]="BA";
        estados[5]="CE";
        //captura do estado que vai ser procurado na lista
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sigla do Estado que voc� procura: ");
        String intemProcurado = sc.nextLine();
        //esse chaveador � importante, pois com ele podemos percorrer toda a lista e s� depois
        //fora do for, tomamos a decis�o de impress�o
        boolean chaveador=false;
        //percorre linearmente toda a lista
        for(String aux: estados){
            String estadoAtual = aux;
            if(estadoAtual.equalsIgnoreCase(intemProcurado)){
                chaveador=true;
                break;// quando o estado for encontrado esse break far� sair do for
            }
        }
        if(chaveador){
            System.out.println("O estado "+intemProcurado + " foi encontrado");
        }else {
            System.out.println("O estado "+intemProcurado + " n�o foi encontrado na lista");
        }

    }
}
