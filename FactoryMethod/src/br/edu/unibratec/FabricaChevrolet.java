package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class FabricaChevrolet implements FabricaDeCarro {
    @Override
    public Carro criarCarro(int tipo) {
        return new Celta();
    }
}
