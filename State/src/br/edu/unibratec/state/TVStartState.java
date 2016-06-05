package br.edu.unibratec.state;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV está ligada");
    }
}
