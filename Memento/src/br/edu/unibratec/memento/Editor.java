package br.edu.unibratec.memento;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class Editor {
    private String conteudo;

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public EditorMemento salvar() {
        return new EditorMemento(this.conteudo);
    }

    public void restaurarEstado(EditorMemento editorMemento) {
        this.conteudo = editorMemento.getEstadoSalvo();
    }
}
