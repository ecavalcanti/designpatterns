package br.edu.unibratec.observer;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class Pessoa implements Observer {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String nomeProduto) {
        System.out.println("Olá " + nome
         + ", " + nomeProduto + " está disponível");
    }
}
