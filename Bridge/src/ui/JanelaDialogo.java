package ui;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class JanelaDialogo extends JanelaAbstrata {

    public JanelaDialogo(Janela janela) {
        super(janela);
    }

    @Override
    public void desenhar() {
        this.desenharJanela("Diálogo");
        this.desenharBotao("Sim");
        this.desenharBotao("Não");
        this.desenharBotao("Cancelar");
    }
}
