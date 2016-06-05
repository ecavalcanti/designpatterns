package br.edu.unibratec.commands;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class Interruptor {
    private Command ligarCommand, desligarCommand;

    public Interruptor(Command ligarCommand,
                       Command desligarCommand) {
        this.ligarCommand = ligarCommand;
        this.desligarCommand = desligarCommand;
    }

    public void ligar() {
        ligarCommand.execute();
    }

    public void desligar() {
        desligarCommand.execute();
    }
}
