package br.com.abc.javacore.jdbc.connection;

import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
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
    pegar meta dados, por exemplo nome das colunas, quantidade de colunas
    com o resultset você pode mover o cursor para a linha que desejar
    pode fazer também update mais complexos
Classe DriveManager = a conexão vem através desta classe que vai buscar o conector daquele banco de dados
O DriverManeger é uma fábrica de objetos que vai te devolver uma conexão baseado na url que você especificar
RowSet é um ResultSet a diferença são os tipos, um que mantém a conexão direto com o BD e o desconectado
    que salva os registros em memória fica trabalhando com eles e atualiza o banco depois, vantagens é mais simples
    não precisa criar Statments não precisa ficar criando a conexão, ele faz tudo isso.
    Com o RowSet não podemos utilizar comandos update, insert ou delete
Java Bean é uma classe Java normal com getters e setters.
CachedRowSet é um tipo de RowSet que trabalha desconectado, ou seja, ele faz a query, trabalha no resultado e se houver
    alteração ele envia no final

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
    //Método Connection para o RowSet
    public static JdbcRowSet getRowSetConexao() {
        //Vamos obter nossa conexão, precisamos de três coisas: url, users and password
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false";
        String user = "root";
        String password = "";
        //agora vou pegar um objeto do tipo RowSet
        try {
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl(url);
            jdbcRowSet.setUsername(user);
            jdbcRowSet.setPassword(password);

            return jdbcRowSet;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    //Método Connection para o CachedRowSet
    public static CachedRowSet getRowSetConexaoCached() {
        //Vamos obter nossa conexão, precisamos de três coisas: url, users and password
        String url = "jdbc:mysql://localhost:3306/agencia?useSSL=false&relaxAutoCommit=true";
        String user = "root";
        String password = "";
        //agora vou pegar um objeto do tipo RowSet
        try {
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            cachedRowSet.setUrl(url);
            cachedRowSet.setUsername(user);
            cachedRowSet.setPassword(password);

            return cachedRowSet;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    //método sobre carregado para fechar a conexão do RowSet
    public static void close(JdbcRowSet jdbcRowSet) {
        try {
            if (jdbcRowSet != null)//tratamento para o caso de ser nulo
                jdbcRowSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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
