package br.edu.unibratec;

import br.edu.unibratec.strategy.Context;
import br.edu.unibratec.strategy.OperacaoMultiplicacao;
import br.edu.unibratec.strategy.OperacaoSoma;
import br.edu.unibratec.strategy.OperacaoSubtracao;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new OperacaoSoma());
        System.out.println(context.executarOperacao(2, 4));

        context = new Context(new OperacaoSubtracao());
        System.out.println(context.executarOperacao(5,2));

        context = new Context(new OperacaoMultiplicacao());
        System.out.println(context.executarOperacao(2,5));
    }
}
