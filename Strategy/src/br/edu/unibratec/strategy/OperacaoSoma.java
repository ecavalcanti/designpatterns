package br.edu.unibratec.strategy;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class OperacaoSoma implements Strategy {
    @Override
    public int executarOperacao(int num1, int num2) {
        return num1 + num2;
    }
}
