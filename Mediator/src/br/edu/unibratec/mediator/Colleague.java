package br.edu.unibratec.mediator;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enviar(String mensagem) {
        mediator.enviar(mensagem, this);
    }

    public abstract void receber(String mensagem);

}
