package br.edu.unibratec.visitor;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class AtualizadorConta implements ContaVisitor {
    @Override
    public void atualizar(ContaCorrente contaCorrente) {
        contaCorrente.setSaldo(
                contaCorrente.getSaldo() + (contaCorrente.getSaldo() * 0.0)
        );
    }

    @Override
    public void atualizar(ContaPoupanca contaPoupanca) {
        contaPoupanca.setSaldo(
                contaPoupanca.getSaldo() + (contaPoupanca.getSaldo() * 0.5)
        );
    }
}
