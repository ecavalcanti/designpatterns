package br.edu.unibratec;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class Sprite implements SpriteFlyweight {
    private Imagem imagem;

    public Sprite(String nomeDoArquivo) {
        this.imagem = new Imagem(nomeDoArquivo);
    }

    @Override
    public void desenharImagem(Ponto ponto) {
        this.imagem.desenharImagem();
        System.out.println("No ponto (" +
            ponto.getX() + "," + ponto.getY() + ")");
    }
}
