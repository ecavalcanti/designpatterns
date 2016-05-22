package br.edu.unibratec.db;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class MSSQLFactory implements DBFactory {
    @Override
    public DBConnection createConnection() {
        return new MSSQLConnection();
    }

    @Override
    public DBCommand createCommand() {
        return new MSSQLCommand();
    }
}
