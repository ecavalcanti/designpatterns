package br.edu.unibratec.bebidas;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class Suco extends CoquetelDecorator {
    public Suco(Coquetel coquetel) {
        super(coquetel);
        nome = "Suco";
        preco = 3.5;
    }
}
