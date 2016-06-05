package br.edu.unibratec.visitor;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public interface ContaVisitor {
    void atualizar(ContaCorrente contaCorrente);
    void atualizar(ContaPoupanca contaPoupanca);
}
