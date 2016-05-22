package br.edu.unibratec;

import br.edu.unibratec.io.Arquivo;
import br.edu.unibratec.io.Documento;
import br.edu.unibratec.io.MP3;

public class Main {

    public static void main(String[] args) {
        Arquivo doc = new Documento();
        doc.setDescricao("Aula de Padrões de Projeto (Design Patterns");
        doc.abrir();
        ((Documento)doc).editar();

        MP3 mp3 = new MP3();
        mp3.setDescricao("Titanium");
        mp3.abrir();

    }
}
