package br.edu.unibratec.strategy;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executarOperacao(int num1, int num2) {
        return strategy.executarOperacao(num1, num2);
    }
}
