package br.com.abc.javacore.jdbc.connection;

import java.sql.*;

/*
o jdcb � uma biblioteca java que serve para abstrair os problemas dos banco de dados
ent�o o que eu devo aprender a fazer � utilizar as interfaces do pacote java.sql
Connection - buscar a conex�o,
    createStatment
Statement - realizar opera��es que v�o afetar o estado do banco,
    executeUpdate - modifica o banco
    executeQuery - faz uma consulta ao banco (ResultQuery)
ResultSet - trabalha com os resultados daquela consulta
Classe DriveManager = a conex�o vem atrav�s desta classe que vai buscar o conector daquele banco de dados
O DriverManeger � uma f�brica de objetos que vai te devolver uma conex�o baseado na url que voc� especificar
 */
public class ConexaoFactory {
    //m�todo respons�vel por pegar a conex�o
    public static Connection getConexao() {
        //Vamos obter nossa conex�o, precisamos de tr�s coisas: url, users and password
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
        String user = "root";
        String password = "";
        //agora vou pegar a conex�o atrav�s da DriverManager
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            //System.out.println(connection); imprime minha conex�o na tela
            return connection;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    //m�todo criado para fechar a conex�o
    public static void close(Connection connection) {
        try {
            if (connection != null)//tratamento para o caso de ser nulo
                connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //m�todo sobrecarregado para fechar a statment
    public static void close(Connection connection, Statement statement) {
        close(connection);
        try {
            if (statement != null)//tratamento para o caso de ser nulo
                statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    //m�todo sobrecarregado para fechar o resultSet
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
