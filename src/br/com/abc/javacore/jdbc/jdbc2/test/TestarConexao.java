package br.com.abc.javacore.jdbc.jdbc2.test;

import br.com.abc.javacore.jdbc.jdbc2.connection.FabricaDeConexao;
import br.com.abc.javacore.jdbc.jdbc2.repository.CompradorRepository;

public class TestarConexao {
    public static void main(String[] args) {
//        FabricaDeConexao conexao = new FabricaDeConexao();
//        System.out.println(conexao.pegarConexao());
        //ap�s modificar o m�todo pegarConexao para static, posso utiliz�-lo direto da Classe
        System.out.printf("Est� %s � minha conex�o",FabricaDeConexao.pegarConexao());
        //utilizando o m�todo save antes de ter um objeto de dom�nio
        CompradorRepository compradorRepository = new CompradorRepository();
        compradorRepository.save();
    }
}
