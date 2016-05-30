package br.edu.unibratec.ui;

import java.util.List;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public abstract class Component {

    public abstract void draw();

    public void add(Component component) {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException("Operação não suportada");
    }

    public List<Component> getChildren() {
        throw new UnsupportedOperationException("Operação não suportada");
    }
}
