package ui;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class JanelaWindows implements Janela {
    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Windows");
    }

    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Windows");
    }
}
