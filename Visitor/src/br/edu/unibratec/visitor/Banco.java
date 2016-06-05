package br.edu.unibratec.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void atualizar(ContaVisitor contaVisitor) {
        for (Conta conta : contas) {
            conta.atualizar(contaVisitor);
        }
    }
}
