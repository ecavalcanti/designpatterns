package ui;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class JanelaAviso extends JanelaAbstrata{

    public JanelaAviso(Janela janela) {
        super(janela);
    }

    @Override
    public void desenhar() {
        this.desenharJanela("Aviso");
        this.desenharBotao("OK");
    }
}
