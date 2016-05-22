package br.edu.unibratec.db;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class MSSQLCommand implements DBCommand {
    @Override
    public void execute(String sql) {
        System.out.println("Método execute do MSSQLCommand foi chamado - " + sql);
    }
}
