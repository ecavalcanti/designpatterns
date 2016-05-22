package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Pessoa {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void dormir() {
        System.out.println(nome + " domindo...");
    }

}
