package br.com.abc.javacore.expressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "William, Wellington, Gustavo, Silvana, Laura";
        //preciso separar cada uma dos nomes e guardar em var�veis distintas
        //os nomes s�o os tokens e o delimitador ser� a virgula
        String[] tokens = str.split(",");//aqui tamb�m pode ser passado uma express�o regular
        for (String nome: tokens) {
            System.out.println(nome.trim());
        }
    }
}
