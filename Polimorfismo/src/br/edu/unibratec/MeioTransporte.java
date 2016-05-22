package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public abstract class MeioTransporte {
    protected String modelo;

    public MeioTransporte(String modelo) {
        this.modelo = modelo;
    }

    public MeioTransporte(){

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void mover();

}
