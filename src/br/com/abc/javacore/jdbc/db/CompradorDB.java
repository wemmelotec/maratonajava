package br.com.abc.javacore.jdbc.db;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.connection.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//classe respons�vel por operar no BD
public class CompradorDB {

    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "')";
        //como eu coloquei o m�todo getConexao como est�tico eu posso utiliz�-lo direto da Classe
        Connection connection = ConexaoFactory.getConexao();
        //Statmente � o que vai executar esse sql no banco
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
            System.out.println("O comprador n�o foi encontrado");
            return;//se o comprador for nulo, esse return sa� do m�todo delete, n�o executa as linhas abaixo
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + comprador.getId() + "');";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            ConexaoFactory.close(connection, statement);
            System.out.println("Registro exclu�do com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("N�o foi poss�vel atualizar o registro!");
            return;//se o comprador for nulo, esse return sa� do m�todo delete, n�o executa as linhas abaixo
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

    //resultSet para trabalhar com meta dados (importante quando voc� n�o conhece a estrutura dos dados no banco)
    //muito �til para conhecer o banco que voc� vai trabalhar
    public static void selectMetaData() {
        String sql = "SELECT * FROM agencia.comprador";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            ResultSetMetaData metaData = resultSet.getMetaData();
            resultSet.next();//movendo o curso apenas para a primeira posi��o
            int quantidadeColunas = metaData.getColumnCount();
            System.out.println("Quantidade de colunas: " + quantidadeColunas);
            for (int i = 1; i <= quantidadeColunas; i++) {
                System.out.println("Tabela " + metaData.getTableName(i));
                System.out.println("Coluna " + metaData.getColumnName(i));
                System.out.println("Tamanho coluna " + metaData.getColumnDisplaySize(i));
            }
            ConexaoFactory.close(connection, statement, resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //tr�s tipos de navega��o com o resultset
    public static void checkDriverStatus() {
        Connection connection = ConexaoFactory.getConexao();
        try {
            DatabaseMetaData metaData = connection.getMetaData();//meta dados direto da conex�o
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                //verificar se o registro pode ser atualizado com o resultset aberto
                //ou se � apenas de leitura
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) ;
                System.out.println("Suporta atualiza��o");
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE"); //trabalha com se o banco estivesse em mem�ria, mesmo que alguma outra pessoa altere o banco ele n�o altera o resultset
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE))
                    ;
                System.out.println("Suporta atualiza��o");
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");//se houver altera��o no banco, ele altera o resultset
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE))
                    ;
                System.out.println("Suporta atualiza��o");
            }
            ConexaoFactory.close(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //m�todos para brincar com os registro dentro resultset
    public static void testTypeScroll() {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador ORDER BY nome";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.last()) {
                //essa linha vai criar o objeto com o resultSet e depois adiciona a lista
                System.out.println("Ultima linha " + (new Comprador(resultSet.getInt("id"), resultSet.getString("cpf"), resultSet.getString("nome"))));
                System.out.println("N�mero da linha atual " + resultSet.getRow());//retorna um int da linha atual do select que fizemos
            }
            System.out.println("Retornou para primeira linha: " + resultSet.first());
            System.out.println("N�mero da linha atual " + resultSet.getRow());
            resultSet.absolute(3);
            System.out.println("N�mero da linha atual " + resultSet.getRow());
            ConexaoFactory.close(connection, statement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
