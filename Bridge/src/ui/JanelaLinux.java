package ui;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class JanelaLinux implements Janela {
    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Linux");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Linux");
    }
}
