package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class FabricaFiat implements FabricaDeCarro {
    @Override
    public Carro criarCarro(int tipo) {
        if (tipo == 1) {
            return new Palio();
        } else {
            return new Siena();
        }

    }
}
