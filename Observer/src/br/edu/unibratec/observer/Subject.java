package br.edu.unibratec.observer;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
