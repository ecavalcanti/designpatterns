package br.edu.unibratec.visitor;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public abstract class Conta implements Element {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
