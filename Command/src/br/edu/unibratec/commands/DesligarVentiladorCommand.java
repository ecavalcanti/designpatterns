package br.edu.unibratec.commands;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class DesligarVentiladorCommand implements Command {
    private Ventilador ventilador;

    public DesligarVentiladorCommand(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void execute() {
        ventilador.pararRotacao();
    }
}
