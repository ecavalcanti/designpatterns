package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class ConexaoDB {

    private static ConexaoDB instance;
    private int score = 0;

    private ConexaoDB(){
        System.out.println("Instanciando ConexaoDB");
    }

    public static ConexaoDB getInstance() {
        if (instance == null) {
            instance = new ConexaoDB();
        }

        return instance;
    }

    public void open() {
        System.out.println("Abrindo conexão....");
    }

    public void execute(String sql) {
        System.out.println("Executando... " + sql);
    }

    public void close() {
        System.out.println("Fechando conexão");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



}
