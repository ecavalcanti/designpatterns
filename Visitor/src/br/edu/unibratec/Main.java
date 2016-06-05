package br.edu.unibratec;

import br.edu.unibratec.visitor.*;

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(100.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000.00);

        Banco banco = new Banco();
        banco.getContas().add(contaCorrente);
        banco.getContas().add(contaPoupanca);

        ContaVisitor visitor = new AtualizadorConta();
        banco.atualizar(visitor);

        for (Conta conta:banco.getContas()) {
            System.out.println(conta.getClass().getSimpleName() +
            " " + conta.getSaldo());
        }
    }
}
