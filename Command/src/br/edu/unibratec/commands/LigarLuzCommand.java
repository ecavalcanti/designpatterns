package br.edu.unibratec.commands;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class LigarLuzCommand implements Command {
    private Luz luz;

    public LigarLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.acender();
    }
}
