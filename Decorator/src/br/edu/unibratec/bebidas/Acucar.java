package br.edu.unibratec.bebidas;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class Acucar extends CoquetelDecorator {
    public Acucar(Coquetel coquetel) {
        super(coquetel);
        nome = "Açucar";
        preco = 0.2;
    }
}
