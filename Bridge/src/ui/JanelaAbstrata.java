package ui;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public abstract class JanelaAbstrata implements Janela {
    private Janela janela;

    public JanelaAbstrata(Janela janela) {
        this.janela = janela;
    }


    @Override
    public void desenharJanela(String titulo) {
        this.janela.desenharJanela(titulo);
    }

    @Override
    public void desenharBotao(String titulo) {
        this.janela.desenharBotao(titulo);
    }

    public abstract void desenhar();

}
