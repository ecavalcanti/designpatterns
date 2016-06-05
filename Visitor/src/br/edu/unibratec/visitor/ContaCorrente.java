package br.edu.unibratec.visitor;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class ContaCorrente extends Conta {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void atualizar(ContaVisitor contaVisitor) {
        contaVisitor.atualizar(this);
    }
}
