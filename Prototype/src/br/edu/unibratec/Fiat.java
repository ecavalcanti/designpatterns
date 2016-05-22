package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Fiat extends Carro {
    public Fiat(String modelo) {
        super(modelo);
    }

    @Override
    public Carro clonar() throws CloneNotSupportedException {
        return (Fiat)this.clone();
    }
}
