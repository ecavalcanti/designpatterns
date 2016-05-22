package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Carro extends MeioTransporte {
    private String marca;

    public Carro (String modelo){
        super(modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void mover() {
        System.out.println(marca + " " + modelo + " andando...");
    }
}
