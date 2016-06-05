package br.edu.unibratec.commands;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class LigarVentiladorCommand implements Command {
    private Ventilador ventilador;

    public LigarVentiladorCommand(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void execute() {
        ventilador.iniciarRotacao();
    }
}
