package br.edu.unibratec.state;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class TVContext {
    private State tvState;

    public State getTvState() {
        return tvState;
    }

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }

    public void doAction() {
        this.tvState.doAction();
    }
}
