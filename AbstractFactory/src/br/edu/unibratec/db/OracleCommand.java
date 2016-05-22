package br.edu.unibratec.db;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class OracleCommand implements DBCommand {
    @Override
    public void execute(String sql) {
        System.out.println("Método execute do OracleCommand foi chamado - " + sql);
    }
}
