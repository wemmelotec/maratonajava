package br.com.abc.javacore.expressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "William, Wellington, Gustavo, Silvana, Laura";
        //preciso separar cada uma dos nomes e guardar em varáveis distintas
        //os nomes são os tokens e o delimitador será a virgula
        String[] tokens = str.split(",");//aqui também pode ser passado uma expressão regular
        for (String nome: tokens) {
            System.out.println(nome.trim());
        }
    }
}
