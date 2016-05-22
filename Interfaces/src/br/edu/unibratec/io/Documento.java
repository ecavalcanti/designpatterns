package br.edu.unibratec.io;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Documento extends Arquivo implements Imprimivel, Editavel {

    @Override
    public void abrir() {
        System.out.println("Exibindo o documento " + descricao);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo o documento " + descricao);
    }

    @Override
    public void editar() {
        System.out.println("Editando o documento " + descricao);
    }
}
