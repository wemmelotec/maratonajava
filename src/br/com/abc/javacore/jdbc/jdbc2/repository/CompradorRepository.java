package br.com.abc.javacore.jdbc.jdbc2.repository;

import br.com.abc.javacore.jdbc.connection.ConexaoFactory;
import br.com.abc.javacore.jdbc.jdbc2.connection.FabricaDeConexao;
import br.com.abc.javacore.jdbc.jdbc2.domain.Comprador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CompradorRepository {

    public static void save(Comprador comprador){
        String comandoSql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('"+comprador.getCpf()+"', '"+comprador.getNome()+"')";
        Connection conexao = FabricaDeConexao.pegarConexao();
        try {
            Statement instrucaoSql = conexao.createStatement();
            instrucaoSql.executeUpdate(comandoSql);
            System.out.println("O registro foi inserido com sucesso!");
            FabricaDeConexao.fecharConexao(conexao,instrucaoSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void deletarRegistro(Comprador comprador){
        if(comprador == null || comprador.getId() == null){
            System.out.println("Comprador não nulo");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + comprador.getId() + "');";
        Connection connection = FabricaDeConexao.pegarConexao();
        try {
            Statement instrucaoSql = connection.createStatement();
            instrucaoSql.executeUpdate(sql);
            FabricaDeConexao.fecharConexao(connection,instrucaoSql);
            System.out.println("O Registro foi excluído!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletarRegistroById(Integer id){
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + id + "');";
        Connection connection = FabricaDeConexao.pegarConexao();
        try {
            Statement instrucaoSql = connection.createStatement();
            instrucaoSql.executeUpdate(sql);
            FabricaDeConexao.fecharConexao(connection,instrucaoSql);
            System.out.println("O Registro foi excluído!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateNome(Comprador comprador){
        if(comprador==null || comprador.getId()==null){
            System.out.println("O registro não foi encontrado!");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '"+comprador.getCpf()+"', `nome` = '" + comprador.getNome() + "' WHERE (`id` = '"+comprador.getId()+"')";
        Connection connection = FabricaDeConexao.pegarConexao();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            FabricaDeConexao.fecharConexao(connection,statement);
            System.out.println("O Registro foi atualizado!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> selectAll(){
        String sql = "SELECT * FROM `agencia`.`comprador`";
        Connection connection = FabricaDeConexao.pegarConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                compradorList.add(new Comprador(resultSet.getInt("id"),resultSet.getString("cpf"), resultSet.getString("nome")));
            }
            FabricaDeConexao.fecharConexao(connection,statement,resultSet);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return compradorList;
    }

}
