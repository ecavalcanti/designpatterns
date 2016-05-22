package br.edu.unibratec;

public class Main {

    public static void main(String[] args) {
	    ConexaoDB conn = ConexaoDB.getInstance();

        conn.open();
        conn.execute("SELECT * FROM USERS");
        conn.close();
        ConexaoDB.getInstance().setScore(10);
        System.out.println(ConexaoDB.getInstance().getScore());

        ConexaoDB conn1 = ConexaoDB.getInstance();
        conn1.open();
        conn1.execute("SELECT * FROM PRODUCTS");
        conn1.close();
        ConexaoDB.getInstance().setScore(ConexaoDB.getInstance().getScore() + 20);
        System.out.println(ConexaoDB.getInstance().getScore());
    }
}
