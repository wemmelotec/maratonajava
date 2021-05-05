package br.com.abc.javacore.jdbc.jdbc2.test;

import br.com.abc.javacore.jdbc.jdbc2.connection.FabricaDeConexao;
import br.com.abc.javacore.jdbc.jdbc2.repository.CompradorRepository;

public class TestarConexao {
    public static void main(String[] args) {
//        FabricaDeConexao conexao = new FabricaDeConexao();
//        System.out.println(conexao.pegarConexao());
        //após modificar o método pegarConexao para static, posso utilizá-lo direto da Classe
        System.out.printf("Está %s é minha conexão",FabricaDeConexao.pegarConexao());
        //utilizando o método save antes de ter um objeto de domínio
        CompradorRepository compradorRepository = new CompradorRepository();
        compradorRepository.save();
    }
}
