package br.com.abc.javacore.jdbc.db;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.connection.ConexaoFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//classe responsável por operar no BD
public class CompradorDB {

    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "')";
        //como eu coloquei o método getConexao como estático eu posso utilizá-lo direto da Classe
        Connection connection = ConexaoFactory.getConexao();
        //Statmente é o que vai executar esse sql no banco
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            ConexaoFactory.close(connection, statement);
            System.out.println("Registro inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("O comprador não foi encontrado");
            return;//se o comprador for nulo, esse return saí do método delete, não executa as linhas abaixo
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + comprador.getId() + "');";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            ConexaoFactory.close(connection, statement);
            System.out.println("Registro excluído com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possível atualizar o registro!");
            return;//se o comprador for nulo, esse return saí do método delete, não executa as linhas abaixo
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCpf() + "', `nome` = '" + comprador.getNome() + "' WHERE (`id` = '" + comprador.getId() + "')";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            ConexaoFactory.close(connection, statement);
            System.out.println("Registro atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //public static void selectAll()
    public static List<Comprador> selectAll() {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador";
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //essa linha vai criar o objeto com o resultSet e depois adiciona a lista
                compradorList.add(new Comprador(resultSet.getInt("id"), resultSet.getString("cpf"), resultSet.getString("nome")));
//                System.out.println(resultSet.getInt("id"));
//                System.out.println(resultSet.getString("cpf"));
//                System.out.println(resultSet.getString("nome"));
            }
            ConexaoFactory.close(connection, statement, resultSet);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador WHERE nome LIKE '%" + nome + "%'";
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                //essa linha vai criar o objeto com o resultSet e depois adiciona a lista
                compradorList.add(new Comprador(resultSet.getInt("id"), resultSet.getString("cpf"), resultSet.getString("nome")));
            }
            ConexaoFactory.close(connection, statement, resultSet);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
