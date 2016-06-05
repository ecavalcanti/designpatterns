package br.edu.unibratec.state;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class TVStopState implements State {
    @Override
    public void doAction() {
        System.out.println("TV está desligada");
    }
}
