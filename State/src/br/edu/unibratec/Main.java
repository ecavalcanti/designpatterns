package br.edu.unibratec;

import br.edu.unibratec.state.State;
import br.edu.unibratec.state.TVContext;
import br.edu.unibratec.state.TVStartState;
import br.edu.unibratec.state.TVStopState;

public class Main {

    public static void main(String[] args) {
        TVContext context = new TVContext();

        State start = new TVStartState();
        State stop = new TVStopState();

        context.setTvState(start);
        context.doAction();

        context.setTvState(stop);
        context.doAction();
    }
}
