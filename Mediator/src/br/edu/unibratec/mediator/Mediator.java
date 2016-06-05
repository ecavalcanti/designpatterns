package br.edu.unibratec.mediator;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public interface Mediator {
    void enviar(String mensagem, Colleague colleague);
}
