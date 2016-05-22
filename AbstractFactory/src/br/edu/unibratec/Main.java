package br.edu.unibratec;

import br.edu.unibratec.db.*;

public class Main {

    public static void main(String[] args) {
	    String dbType = "mssql";
        DBFactory factory;
        DBConnection conn;
        DBCommand command;


        if (dbType.equals("oracle")) {
            factory = new OracleFactory();
        } else {
            factory = new MSSQLFactory();
        }

        conn = factory.createConnection();
        command = factory.createCommand();

        conn.open();
        command.execute("SELECT * FROM USUARIOS");
        conn.close();

    }
}
