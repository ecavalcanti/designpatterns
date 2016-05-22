package br.edu.unibratec.io;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class MP3 extends Arquivo {

    @Override
    public void abrir() {
        System.out.println("Tocando arquivo MP3 " + descricao);
    }
}
