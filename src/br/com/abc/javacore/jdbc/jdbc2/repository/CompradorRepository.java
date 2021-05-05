package br.com.abc.javacore.jdbc.jdbc2.repository;

import br.com.abc.javacore.jdbc.jdbc2.connection.FabricaDeConexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorRepository {
    public void save(){
        String comandoSql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('123.123.123-20', 'gustavo')";
        Connection conexao = FabricaDeConexao.pegarConexao();
        try {
            Statement instrucaoSql = conexao.createStatement();
            instrucaoSql.executeUpdate(comandoSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
