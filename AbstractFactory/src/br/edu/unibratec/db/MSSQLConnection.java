package br.edu.unibratec.db;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class MSSQLConnection implements DBConnection {

    @Override
    public void open() {
        System.out.println("Método open do MSSQLConnection foi chamado");
    }

    @Override
    public void close() {
        System.out.println("Método close do MSSQLConnection foi chamado");
    }
}
