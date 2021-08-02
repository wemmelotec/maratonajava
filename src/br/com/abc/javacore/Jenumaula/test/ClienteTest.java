package br.com.abc.javacore.Jenumaula.test;

import br.com.abc.javacore.Jenumaula.classes.Cliente;
import br.com.abc.javacore.Jenumaula.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        //para evitar que o cliente passe um n�mero inteiro qualquer no segundo par�metro
        //j� que o construtor aceita o int � que foi criada esse tipo especial de Classe(atributo) ENUM
        Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_FISICA);
        Cliente cliente1 = new Cliente("wellington", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
        System.out.println(cliente);
        System.out.println(cliente1);
    }
}
