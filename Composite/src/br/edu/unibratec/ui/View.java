package br.edu.unibratec.ui;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class View extends Component {
    private List<Component> components = new ArrayList<>();

    @Override
    public void draw() {
        System.out.println("Desenhando a View");
        for (Component component:components) {
            component.draw();
        }

    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public List<Component> getChildren() {
        return this.components;
    }
}
