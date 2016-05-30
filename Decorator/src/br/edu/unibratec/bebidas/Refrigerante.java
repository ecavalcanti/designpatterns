package br.edu.unibratec.bebidas;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class Refrigerante extends CoquetelDecorator {
    public Refrigerante(Coquetel coquetel) {
        super(coquetel);
        nome = "Refrigerante";
        preco = 3.0;
    }
}
