package br.edu.unibratec.model;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class Cliente {
    private String nome;
    private String sobreNome;

    public Cliente(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
