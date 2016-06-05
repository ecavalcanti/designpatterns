package br.edu.unibratec.memento;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class EditorMemento {
    private String estadoEditor;

    public EditorMemento(String estadoEditor) {
        this.estadoEditor = estadoEditor;
    }

    public String getEstadoSalvo() {
        return this.estadoEditor;
    }
}
