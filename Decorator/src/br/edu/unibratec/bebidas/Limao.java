package br.edu.unibratec.bebidas;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class Limao extends CoquetelDecorator {
    public Limao(Coquetel coquetel) {
        super(coquetel);
        nome = "Limao";
        preco = 0.5;
    }
}
