package br.edu.unibratec.bebidas;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class CoquetelDecorator extends Coquetel {
    Coquetel coquetel;

    public CoquetelDecorator(Coquetel coquetel) {
        this.coquetel = coquetel;
    }

    @Override
    public String getNome() {
        return coquetel.getNome() + " + " + nome;
    }

    @Override
    public double getPreco() {
        return coquetel.getPreco() + preco;
    }
}
