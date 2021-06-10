package br.com.abc.javacore.jdbc.db;

import br.com.abc.javacore.jdbc.classes.Comprador;
import br.com.abc.javacore.jdbc.classes.MyRowSetListener;
import br.com.abc.javacore.jdbc.connection.ConexaoFactory;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
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
    //para updates mais complexos utilizar o resultset
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

    //como vou fazer updates mais complexos vou utilizar o resultset
    //em vez de fazer direto no banco vou trabalhar com o resultado da consulta na aplica��o e depois atualizo no banco
    //suponha que seu banco tenha varios usu�rios com nomes misturados UPPERCASE e LOWERCASE e voc�precise passar
    //tudo para lowercase
    /*
    esse m�todo � muito �til para realizar calculos complicados na aplica��o e depois enviar para o banco
     */
    public static void updateNomesToLowerCase(){
        String sql = "SELECT id,cpf,nome FROM agencia.comprador";
        Connection connection = ConexaoFactory.getConexao();
        try {
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(sql);
//            //imprimir o resultset
//            while (resultSet.next()){
//                System.out.println(resultSet.getInt("id"));
//            }

//            //para atualizar
//            while (resultSet.next()) {
//                //esse update atualiza no resultset e n�o no banco de dados
//             resultSet.updateString("nome", resultSet.getString("nome").toLowerCase());
//             //caso eu fa�a alguma modifica��o e queira retornar
//                //resultSet.cancelRowUpdates();
//             //agora para atualizar no banco roda o m�todo abaixo
//                resultSet.updateRow();
//            }

//            //agora para inserir
//            resultSet.absolute(2); //coloquei o cursor na segunda linha do resultset
//            String nome = resultSet.getString("nome"); //peguei o nome desse objeto
//            resultSet.moveToInsertRow();//movi o objeto para uma linha temporaria e de onde ele saiu fica null como pode ser visto pelos sout
////            System.out.println(nome);
////            System.out.println(resultSet.getString("nome"));
//            //note que o cursor do resultset continua na linha 2
//            resultSet.updateString("nome", nome.toUpperCase());
//            resultSet.updateString("cpf", "999.999.99-99");
//            resultSet.insertRow();//para inserir essa nova linha
//            System.out.println(resultSet.getRow());
//            System.out.println(resultSet.getString("nome"));

            //agora para deletar
            resultSet.absolute(5); //ir com o cursor para a linha 10
            resultSet.deleteRow();

            ConexaoFactory.close(connection, statement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*
    PreparedStatement � muito �til quando voc� precisa de alta performace na execu��o de seus sql.
    � uma subclasse de Statment, vou pegar o m�todo searchByName e  utilizar o PreparedStatement.
    O PreparedStatement � uma forma de n�o permitir o sqlinjection, pois ele n�o permite apostrofos como parametro
     */
    public static List<Comprador> searchByNamePreparedStatement(String nome) {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador WHERE nome LIKE ?";
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1,"%"+nome+"%");//dado do tipo do nosso coringa ?, posi��o do ? e de onde � o valor
            ResultSet resultSet = prepareStatement.executeQuery();//observe que n�o tem o sql
            while (resultSet.next()) {
                //essa linha vai criar o objeto com o resultSet e depois adiciona a lista
                compradorList.add(new Comprador(resultSet.getInt("id"), resultSet.getString("cpf"), resultSet.getString("nome")));
            }
            ConexaoFactory.close(connection, prepareStatement, resultSet);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //vai utilizar a conex�o do RowSet
    public static List<Comprador> searchByNameRowSet(String nome) {
        String sql = "SELECT id,cpf,nome FROM agencia.comprador WHERE nome LIKE ?";
        JdbcRowSet jdbcRowSet = ConexaoFactory.getRowSetConexao();
        jdbcRowSet.addRowSetListener(new MyRowSetListener());
        List<Comprador> compradorList = new ArrayList<>();
        try {
            jdbcRowSet.setCommand(sql);
            jdbcRowSet.setString(1,"%"+nome+"%");//dado do tipo do nosso coringa ?, posi��o do ? e de onde � o valor
            jdbcRowSet.execute();
            while (jdbcRowSet.next()) {
                //essa linha vai criar o objeto com o resultSet e depois adiciona a lista
                compradorList.add(new Comprador(jdbcRowSet.getInt("id"), jdbcRowSet.getString("cpf"), jdbcRowSet.getString("nome")));
            }
            ConexaoFactory.close(jdbcRowSet);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //update com o RowSet
    public static void updateRowSet(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("N�o foi poss�vel atualizar o registro!");
            return;//se o comprador for nulo, esse return sa� do m�todo delete, n�o executa as linhas abaixo
        }
        String sql = "SELECT * FROM comprador WHERE `id` = ?";
        JdbcRowSet jdbcRowSet = ConexaoFactory.getRowSetConexao();
        jdbcRowSet.addRowSetListener(new MyRowSetListener());
        try {
            jdbcRowSet.setCommand(sql);
//            jdbcRowSet.setString(1, comprador.getCpf());
//            jdbcRowSet.setString(2, comprador.getNome());
            jdbcRowSet.setInt(1,comprador.getId());
            jdbcRowSet.execute();
            jdbcRowSet.next();//andar para a primeira posi��o
            jdbcRowSet.updateString("nome","William");
            jdbcRowSet.updateRow();//atualizar a linha
            ConexaoFactory.close(jdbcRowSet);
            System.out.println("Registro atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //update com o cachedRowSet que � um tipo de RowSet que trabalha desconectado
    public static void updateCachedRowSet(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("N�o foi poss�vel atualizar o registro!");
            return;//se o comprador for nulo, esse return sa� do m�todo delete, n�o executa as linhas abaixo
        }
        String sql = "SELECT * FROM comprador WHERE `id` = ?";
        CachedRowSet cachedRowSet = ConexaoFactory.getRowSetConexaoCached();
        try {
            cachedRowSet.setCommand(sql);
            cachedRowSet.setInt(1,comprador.getId());
            cachedRowSet.execute();
            cachedRowSet.next();//andar para a primeira posi��o
            cachedRowSet.updateString("nome","WWW");
            cachedRowSet.updateRow();//atualizar a linha
            cachedRowSet.acceptChanges();
            System.out.println("Registro atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //update como PreparedStatment
    public static void updatePreparedStatement(Comprador comprador) {
        if (comprador == null || comprador.getId() == null) {
            System.out.println("N�o foi poss�vel atualizar o registro!");
            return;//se o comprador for nulo, esse return sa� do m�todo delete, n�o executa as linhas abaixo
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id` = ?";
        Connection connection = ConexaoFactory.getConexao();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, comprador.getCpf());
            preparedStatement.setString(2, comprador.getNome());
            preparedStatement.setInt(3,comprador.getId());
            preparedStatement.executeUpdate();
            ConexaoFactory.close(connection, preparedStatement);
            System.out.println("Registro atualizado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*
    CallebleStatment � utilizado para fazer consultas utilizando as procedures ou fun��es criadas no banco
     */
    public static List<Comprador> searchByNameCallableStatement(String nome) {
        String sql = "CALL `agencia`.`startprocedure_GetCompradoresPorNome`(?)";
        Connection connection = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setString(1,"%"+nome+"%");//dado do tipo do nosso coringa ?, posi��o do ? e de onde � o valor
            ResultSet resultSet = callableStatement.executeQuery();//observe que n�o tem o sql
            while (resultSet.next()) {
                //essa linha vai criar o objeto com o resultSet e depois adiciona a lista
                compradorList.add(new Comprador(resultSet.getInt("id"), resultSet.getString("cpf"), resultSet.getString("nome")));
            }
            ConexaoFactory.close(connection, callableStatement, resultSet);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
