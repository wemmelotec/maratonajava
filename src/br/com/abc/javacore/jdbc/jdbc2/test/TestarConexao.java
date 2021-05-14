package br.com.abc.javacore.jdbc.jdbc2.test;

import br.com.abc.javacore.jdbc.jdbc2.domain.Comprador;
import br.com.abc.javacore.jdbc.jdbc2.repository.CompradorRepository;
import java.util.List;
/*
CRUD completo via JDBC
 */
public class TestarConexao {
    public static void main(String[] args) {
        /*
        Teste para verificar se a conexão foi feita
        FabricaDeConexao conexao = new FabricaDeConexao();
        System.out.println(conexao.pegarConexao());
        após modificar o método pegarConexao para static, posso utilizá-lo direto da Classe
        System.out.printf("Está %s é minha conexão",FabricaDeConexao.pegarConexao());
         */

        //create();
        List<Comprador> compradorList = retrievelAll();
        for (Comprador comprador : compradorList) {
            System.out.println(comprador);
        }
        //update(6,"001.001.001-22", "LAURA");
        //deletar();
        //deletarPorId(7);
    }

    public static void create() {
        Comprador comp1 = new Comprador("789.789.789-95", "Silvana");
        CompradorRepository.save(comp1);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(4);
        CompradorRepository.deletarRegistro(comprador);
    }

    public static void deletarPorId(Integer id) {
        CompradorRepository.deletarRegistroById(id);
    }

    public static void update(Integer id, String cpf, String nome) {
        Comprador comprador = new Comprador(id, cpf, nome);
        CompradorRepository.updateNome(comprador);
    }

    public static List<Comprador> retrievelAll() {
        return CompradorRepository.selectAll();
    }
}
