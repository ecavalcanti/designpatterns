package br.edu.unibratec.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class CareTaker {
    private List<EditorMemento> estados;

    public CareTaker() {
        estados = new ArrayList<>();
    }

    public void adicionarMemento(EditorMemento memento) {
        estados.add(memento);
    }

    public EditorMemento getMemento(int index) {
        return estados.get(index);
    }
}
