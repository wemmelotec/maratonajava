package br.com.abc.javacore.jdbc.connection;

import java.sql.*;

/*
o jdcb é uma biblioteca java que serve para abstrair os problemas dos banco de dados
então o que eu devo aprender a fazer é utilizar as interfaces do pacote java.sql
Connection - buscar a conexão,
    createStatment
Statement - realizar operações que vão afetar o estado do banco,
    executeUpdate - modifica o banco
    executeQuery - faz uma consulta ao banco (ResultQuery)
ResultSet - trabalha com os resultados daquela consulta
Classe DriveManager = a conexão vem através desta classe que vai buscar o conector daquele banco de dados
O DriverManeger é uma fábrica de objetos que vai te devolver uma conexão baseado na url que você especificar
 */
public class ConexaoFactory {
    //método responsável por pegar a conexão
    public static Connection getConexao() {
        //Vamos obter nossa conexão, precisamos de três coisas: url, users and password
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
        String user = "root";
        String password = "";
        //agora vou pegar a conexão através da DriverManager
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            //System.out.println(connection); imprime minha conexão na tela
            return connection;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //método criado para fechar a conexão
    public static void close(Connection connection) {
        try {
            if (connection != null)//tratamento para o caso de ser nulo
                connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //método sobrecarregado para fechar a statment
    public static void close(Connection connection, Statement statement) {
        close(connection);
        try {
            if (statement != null)//tratamento para o caso de ser nulo
                statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //método sobrecarregado para fechar o resultSet
    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        close(connection,statement);
        try {
            if (resultSet != null)//tratamento para o caso de ser nulo
                resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
