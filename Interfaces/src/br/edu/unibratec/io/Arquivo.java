package br.edu.unibratec.io;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public abstract class Arquivo {
    protected int tamanho;
    protected String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public abstract void abrir();

}
