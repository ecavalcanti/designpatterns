package br.edu.unibratec.commands;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class DesligarLuzCommand implements Command {
    private Luz luz;

    public DesligarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.apagar();
    }
}
