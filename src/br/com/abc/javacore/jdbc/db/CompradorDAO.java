package br.com.abc.javacore.jdbc.db;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.connection.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
Utilizarei o preparedstatment com o try with resources (e por isso não preciso do close)
 */
public class CompradorDAO {

    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES (?,?)";
        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement prepareStatement = connection.prepareStatement(sql)) {
            prepareStatement.setString(1, comprador.getCpf());
            prepareStatement.setString(2, comprador.getNome());
            prepareStatement.executeUpdate();
            System.out.println("Registro inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possível atualizar o registro!");
            return;//se o comprador for nulo, esse return saí do método delete, não executa as linhas abaixo
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE (`id` = ?)";
        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement prepareStatement = connection.prepareStatement(sql)) {
            prepareStatement.setString(1, comprador.getCpf());
            prepareStatement.setString(2, comprador.getNome());
            prepareStatement.setInt(3, comprador.getId());
            prepareStatement.executeUpdate();
            System.out.println("Registro atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("O comprador não foi encontrado");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = ?);";
        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement prepareStatement = connection.prepareStatement(sql)) {
            prepareStatement.setInt(1, comprador.getId());
            prepareStatement.executeUpdate();
            System.out.println("Registro excluído com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Comprador> selectAll() {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador";
        List<Comprador> compradorList = new ArrayList<>();
        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement prepareStatement = connection.prepareStatement(sql);
             ResultSet resultSet = prepareStatement.executeQuery()) {
            while (resultSet.next()) {
                compradorList.add(new Comprador(resultSet.getInt("id"), resultSet.getString("cpf"), resultSet.getString("nome")));
            }
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador WHERE nome LIKE ?";
        List<Comprador> compradorList = new ArrayList<>();
        try (Connection connection = ConexaoFactory.getConexao();
             PreparedStatement prepareStatement = connection.prepareStatement(sql)
        ) {
            prepareStatement.setString(1, "%" + nome + "%");
            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                compradorList.add(new Comprador(resultSet.getInt("id"), resultSet.getString("cpf"), resultSet.getString("nome")));
            }
            ConexaoFactory.close(connection, prepareStatement, resultSet);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
