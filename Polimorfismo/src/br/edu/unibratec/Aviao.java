package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Aviao extends MeioTransporte {

    public Aviao (String modelo){
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println(modelo + " voando...");
    }
}
