package br.com.abc.javacore.Yjdbc.classes;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

public class MyRowSetListener implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("Comando execute");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("Linha foi atualizada, inserida ou deletada");
        //verificar se um evento é do tipo RowSet
        if(event.getSource() instanceof RowSet){
            //variavel de referencia temporaria para chamar o execute
            try {
                ((RowSet) event.getSource()).execute();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("cursor mover");
    }
}
