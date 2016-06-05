package br.edu.unibratec.visitor;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void atualizar(ContaVisitor contaVisitor) {
        contaVisitor.atualizar(this);
    }
}
