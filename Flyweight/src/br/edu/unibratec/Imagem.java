package br.edu.unibratec;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class Imagem {
    private String nomeDoArquivo;

    public Imagem(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public void desenharImagem() {
        System.out.println(nomeDoArquivo + " desenhada!");
    }
}
