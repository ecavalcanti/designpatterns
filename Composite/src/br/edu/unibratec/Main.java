package br.edu.unibratec;

import br.edu.unibratec.ui.Button;
import br.edu.unibratec.ui.Component;
import br.edu.unibratec.ui.InputText;
import br.edu.unibratec.ui.View;

public class Main {

    public static void main(String[] args) {
        Component button = new Button();
        Component inputText = new InputText();
        Component view = new View();
        view.add(button);
        view.add(inputText);
        view.draw();

    }
}
