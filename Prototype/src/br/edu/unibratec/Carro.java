package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public abstract class Carro implements Cloneable {

    private String modelo;
    private double preco;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract Carro clonar() throws CloneNotSupportedException;
}
