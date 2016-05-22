package br.edu.unibratec;

public class Main {

    public static void main(String[] args) {
        MeioTransporte aviao = new Aviao("F22");
        //=aviao.setModelo("F22");
        MeioTransporte carro = new Carro("Palio");
        //carro.setModelo("Palio");
        ((Carro)carro).setMarca("FIAT");
        aviao.mover();
        carro.mover();
    }
}
