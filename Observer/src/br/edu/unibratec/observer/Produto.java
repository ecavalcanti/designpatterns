package br.edu.unibratec.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class Produto implements Subject {
    private List<Observer> pessoas = new ArrayList<>();
    private String nome;
    private String tipo;
    private String disponibilidade;

    public Produto(String nome,String tipo,
                   String disponibilidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.disponibilidade = disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        pessoas.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        pessoas.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer pessoa : pessoas) {
            pessoa.update(nome + " - " + tipo);
        }
    }
}
