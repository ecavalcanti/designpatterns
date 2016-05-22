package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Ford extends Carro {
    public Ford(String modelo) {
        super(modelo);
    }

    @Override
    public Carro clonar() throws CloneNotSupportedException {
        return (Ford)this.clone();
    }
}
