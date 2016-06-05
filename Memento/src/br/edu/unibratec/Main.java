package br.edu.unibratec;

import br.edu.unibratec.memento.CareTaker;
import br.edu.unibratec.memento.Editor;
import br.edu.unibratec.memento.EditorMemento;

public class Main {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Editor editor = new Editor();
        editor.setConteudo("Olá Mundo");
        EditorMemento memento = editor.salvar();
        careTaker.adicionarMemento(memento);

        editor.setConteudo("Aula");
        editor.setConteudo("Design Patterns");
        memento = editor.salvar();
        careTaker.adicionarMemento(memento);

        editor.setConteudo("Exercício");

        System.out.println("Conteúdo atual: " +
        editor.getConteudo());
        memento = careTaker.getMemento(1);
        editor.restaurarEstado(memento);
        System.out.println("Conteúdo anterior: " +
                editor.getConteudo());

        memento = careTaker.getMemento(0);
        editor.restaurarEstado(memento);
        System.out.println("Conteúdo inicial: " +
                editor.getConteudo());


    }
}
