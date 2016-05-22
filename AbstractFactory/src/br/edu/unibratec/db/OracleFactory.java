package br.edu.unibratec.db;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class OracleFactory implements DBFactory {
    @Override
    public DBConnection createConnection() {
        return new OracleConnection();
    }

    @Override
    public DBCommand createCommand() {
        return new OracleCommand();
    }
}
